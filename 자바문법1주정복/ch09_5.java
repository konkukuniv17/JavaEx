package �ڹٹ���1������;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ch09_5 extends JFrame {
	public ch09_5() {
		super("Ŭ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		label.setLocation(50,50); // ���̾ƿ��� �������ϱ� 16,17�ڵ� �־�� ��.
		label.setSize(20, 20);// 
		label.addMouseListener(new MouseAdapter() { //���⼭ �λ��� �����ϴ°� ���̺� ���콺 �����ʸ� ������. 
			// �߿��Ѱ� ����Ʈ ���� �����°� �ƴ϶�°� �� ���.
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource(); // ���̺��� ��ġ ��������
				Container c = la.getParent(); // ���̺��� �����̳�(����Ʈ ��)
				int xBound = c.getWidth() - la.getWidth(); // ���̺��� �� ��ŭ ����
				int yBound = c.getHeight() - la.getHeight(); // ���̺��� ���� ��ŭ ����				
				int x = (int)(Math.random()*xBound); //x ��ġ��ŭ ���� ����
				int y = (int)(Math.random()*yBound);				
				la.setLocation(x, y); // �����̼� ����
			}
		});
		c.add(label); // �� �Ŀ� ���̺� �ٿ��ֱ� 
		
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new ch09_5();
	}
}
