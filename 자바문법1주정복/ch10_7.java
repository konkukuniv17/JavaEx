package 자바문법1주정복;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch10_7 extends JFrame{
	private JLabel label;
	public ch10_7() {
		super("이미지 드래깅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		ImageIcon icon = new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu4.jpg");
		label = new JLabel(icon);
		MyMouseListener listener = new MyMouseListener();
		label.addMouseListener(listener);
		label.addMouseMotionListener(listener);
		label.setSize(icon.getIconWidth(), icon.getIconWidth()); // 이미지의 사이즈로 설정.
		label.setLocation(100,100); // 초기 위치
		c.add(label);
		
		setSize(700, 700);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		private int x, y;
		public void mousePressed(MouseEvent e) {
			x = e.getX(); y = e.getY(); // 마우스를 처음 누른 위치
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
