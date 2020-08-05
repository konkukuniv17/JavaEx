package 자바문법1주정복;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class ch9_2 extends JFrame{
	
	Container c = getContentPane();
	
	public ch9_2(){
		super("키 누르키 색 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		c.setBackground(Color.CYAN);
		c.addKeyListener(new change()); // 리스너를 붙힌다는 느낌.
		
		setSize(300,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class change extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode){
				case KeyEvent.VK_R : c.setBackground(Color.RED); break;
			}
		}
		
		public void keyReleased(KeyEvent e) { // 어탭터 사용시 주의사항은 메소드 명을 추상과 다르게 작성할 경우 정상적으로 작동하지 않을 수 있다.
			int keyCode = e.getKeyCode();
			switch(keyCode){
				case KeyEvent.VK_R : c.setBackground(Color.CYAN); break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch9_2();
	}

}
