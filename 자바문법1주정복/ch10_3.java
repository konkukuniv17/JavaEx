package 자바문법1주정복;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ch10_3 extends JFrame{
	
	Container c = getContentPane();
	public ch10_3() {
		super("두 개의 라디오 버튼 예시");
		
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup(); // 버튼 그룹 객체 생성. -- 그룹에 등록하면 하나만 인식되게 함.
		
		JRadioButton Red = new JRadioButton("Red");
		JRadioButton Blue = new JRadioButton("Blue");
		
		Red.addActionListener(new res());
		Blue.addActionListener(new res());
		g.add(Red); //그룹에 넣기
		g.add(Blue);
		
		c.add(Red); //컨텐트펜에 붙히기
		c.add(Blue);
		
		setSize(200,300);
		setVisible(true);
	}

	class res implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JRadioButton Radio = (JRadioButton)e.getSource(); // 사용자가 클릭한 버튼 알아내기
			if(Radio.getText().equals("Red")) {
				c.setBackground(Color.red);
			}
			else if(Radio.getText().equals("Blue")) {
				c.setBackground(Color.blue);
			}	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_3();
	}

}
