package �ڹٹ���1������;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ch09_bonus2 extends JFrame{
	
	public ch09_bonus2() {
		super("������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JPanel p = new JPanel();
		
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_bonus2();
	}

}
