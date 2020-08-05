package 자바문법1주정복;
// 컨트롤 시프트 O 동시에 누르면 import 자동 삽입된다.
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ch09_369p extends JFrame{
	
	private JLabel la = new JLabel("hello");
	
	public ch09_369p() {
		super("마우스 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouse());
		
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	class MyMouse extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_369p();
	}

}
