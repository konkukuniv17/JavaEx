package �ڹٹ���1������;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ch09_366p extends JFrame{
	
	private JLabel la = new JLabel("hello");
	
	class MyMouse implements MouseListener {
		
		
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public ch09_366p() {
		super("���콺 ������ �ۼ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JLabel la = new JLabel("hello");
		MyMouse m = new MyMouse();
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouse());
		
		c.setLayout(null);
		la.setSize(50,20); // ���̺��� ũ��.
		la.setLocation(30,30); // ���̺��� �ʱ� ��ġ.
		c.add(la); // ��ġ�����ڰ� �������� ���̺��� ũ��� ��ġ�� ���ؼ� �����̳ʿ� add �ؾ��Ѵ�.
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_366p();
	}

}
