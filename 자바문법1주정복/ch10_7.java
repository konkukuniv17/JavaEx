package �ڹٹ���1������;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch10_7 extends JFrame{
	private JLabel label;
	public ch10_7() {
		super("�̹��� �巡��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		ImageIcon icon = new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu4.jpg");
		label = new JLabel(icon);
		MyMouseListener listener = new MyMouseListener();
		label.addMouseListener(listener);
		label.addMouseMotionListener(listener);
		label.setSize(icon.getIconWidth(), icon.getIconWidth()); // �̹����� ������� ����.
		label.setLocation(100,100); // �ʱ� ��ġ
		c.add(label);
		
		setSize(700, 700);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		private int x, y;
		public void mousePressed(MouseEvent e) {
			x = e.getX(); y = e.getY(); // ���콺�� ó�� ���� ��ġ
		}
		public void mouseDragged(MouseEvent e) {
			System.out.println(e.getX() + "," + e.getY());
			int distanceX = e.getX() - x; 
			int distanceY = e.getY() - y;
			label.setLocation(label.getX()+ distanceX, label.getY() + distanceY);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_7();
	}

}
