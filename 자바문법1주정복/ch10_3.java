package �ڹٹ���1������;

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
		super("�� ���� ���� ��ư ����");
		
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup(); // ��ư �׷� ��ü ����. -- �׷쿡 ����ϸ� �ϳ��� �νĵǰ� ��.
		
		JRadioButton Red = new JRadioButton("Red");
		JRadioButton Blue = new JRadioButton("Blue");
		
		Red.addActionListener(new res());
		Blue.addActionListener(new res());
		g.add(Red); //�׷쿡 �ֱ�
		g.add(Blue);
		
		c.add(Red); //����Ʈ�濡 ������
		c.add(Blue);
		
		setSize(200,300);
		setVisible(true);
	}

	class res implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JRadioButton Radio = (JRadioButton)e.getSource(); // ����ڰ� Ŭ���� ��ư �˾Ƴ���
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
