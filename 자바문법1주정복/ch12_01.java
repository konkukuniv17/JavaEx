package 자바문법1주정복;

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
		super("스레드 실행시작");
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
			la.setText(Integer.toString(n)); // 레이블에 카운트 값 출력
			n++; // 카운트 증가
			try {
				Thread.sleep(1000); // 1초동안 잠을 잔다.
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