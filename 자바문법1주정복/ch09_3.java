package �ڹٹ���1������;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class ch09_3 extends JFrame{
	Container c = getContentPane();
	
	public ch09_3() {
		c.setBackground(Color.green);
		//c.addMouseMotionListener(new mouse());
		// ���� �ڵ�� ��Ǹ� �Ǽ� released�� �ν����� ���� ���� �Ʒ� �ڵ�ó�� 2�������� �ؾ��Ѵ�.
		mouse ml = new mouse();
		c.addMouseMotionListener(ml); 
		c.addMouseListener(ml);
		
		
		setSize(300,200);
		setVisible(true);
	}
	
	class mouse extends MouseAdapter implements MouseMotionListener{
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.yellow);
		}
		public void mouseReleased(MouseEvent e) {
			//Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_3();
	}

}
