package 자바문법1주정복;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ch09_5 extends JFrame {
	public ch09_5() {
		super("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		label.setLocation(50,50); // 레이아웃을 없앴으니까 16,17코드 있어야 함.
		label.setSize(20, 20);// 
		label.addMouseListener(new MouseAdapter() { //여기서 인상깊게 봐야하는건 레이블에 마우스 리스너를 붙힌다. 
			// 중요한게 컨텐트 펜이 붙히는게 아니라는거 꼭 기억.
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource(); // 레이블의 위치 가져오기
				Container c = la.getParent(); // 레이블의 컨테이너(컨텐트 펜)
				int xBound = c.getWidth() - la.getWidth(); // 레이블의 폭 만큼 감소
				int yBound = c.getHeight() - la.getHeight(); // 레이블의 높이 만큼 감소				
				int x = (int)(Math.random()*xBound); //x 위치만큼 랜덤 설정
				int y = (int)(Math.random()*yBound);				
				la.setLocation(x, y); // 로케이션 변경
			}
		});
		c.add(label); // 그 후에 레이블 붙여주기 
		
		setSize(250,150);
		setVisible(true);
	}
	static public void main(String [] args) {
		new ch09_5();
	}
}
