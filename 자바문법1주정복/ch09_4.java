package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ch09_4 extends JFrame{
	private Font f;
	private int size;
	
	public ch09_4() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); // 스크린 중앙에 위치하기.
				
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		
		c.addKeyListener(new KeyListener() { // 이게 바로 구현하는 거임. 어나너미스 클래스라고 하나? 아마 그럴거임.
			public void keyPressed(KeyEvent e) { // 키가 눌리면
            	f = label.getFont(); // 라벨의 폰트 가져오고
				size = f.getSize(); // 크기고 알아내고
				if(e.getKeyChar() == '+') { 
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-' && size > 10) { // 5이하로 작아지지 않게 하기.
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			public void keyReleased(KeyEvent e) {} // 리스너라 안써도 이래 해둬야 해
			public void keyTyped(KeyEvent e) {} // 리스너라 안써도 이래 해둬야 해
		});
		
		c.add(label); // 라벨을 컨텐트펜에 붙혀주기! 
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_4();
	}

}
