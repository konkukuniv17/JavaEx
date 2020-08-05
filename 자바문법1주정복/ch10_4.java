package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ch10_4 extends JFrame{

	Container c = getContentPane();
	
	public ch10_4() {
		super("checkBox");
		JCheckBox en = new JCheckBox("버튼 비활성화");
		JCheckBox vi = new JCheckBox("버튼 감추기");
		JButton btn = new JButton("test button");
		c.setLayout(new FlowLayout());
		
		en.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) { // 상태변화한게 선택된 변화면
					btn.setEnabled(false); //
				}
				else
					btn.setEnabled(true);
			}
		});
		
		vi.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) { // 상태변화한게 선택된 변화면
					btn.setVisible(false);
				}
				else
					btn.setVisible(true);
			}
		});
		
		c.add(en);
		c.add(vi);
		c.add(btn);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_4();
	}

}
