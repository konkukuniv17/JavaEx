package �ڹٹ���1������;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch12_01 extends JFrame implements Runnable{
	
	Container c = getContentPane();
	Thread th;
	JLabel la;
	
	public ch12_01() {
		super("������ �������");
		c.setBackground(Color.yellow);
		
		c.setLayout(new FlowLayout());
		la.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(la);
		
		
		setSize(300,300);
		setVisible(true);
		
		th.start();
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			la.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� ���
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch12_01();
	}
}