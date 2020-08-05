package 자바문법1주정복;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch09_6 extends JFrame{

	public ch09_6() {
		this.setTitle("컬러 프레임 3x4");

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 4));
		
		JLabel [] label = new JLabel [12];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};
		
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true); // 배경색이 보이게 설정.
			label[i].setBackground(Color.WHITE); // 각 레이블의 색 설정.
			
			label[i].addMouseListener(new MouseAdapter() { //여기서 인상깊게 봐야하는건 레이블에 마우스 리스너를 붙힌다. 
				// 중요한게 컨텐트 펜이 붙히는게 아니라는거 꼭 기억.
				public void mousePressed(MouseEvent e) {
					JLabel la = (JLabel)e.getSource(); // 레이블의 위치 가져오기
					Container c = la.getParent(); // 레이블의 컨테이너(컨텐트 펜)			
					int math = (int)(Math.random()*16);
					la.setOpaque(true); // 배경색이 보이게 설정.
					la.setBackground(color[math]);
					c.add(la); // 컨텐트펜에 레이블 붙히기.
				}
			});
			
			c.add(label[i]); // 컨텐트펜에 레이블 붙히기.
		}
		/* for문 밖에다 두면은 안된다는 것을 보여주려고 주석으로 남겨두었다.
		 * 
		c.addMouseListener(new MouseAdapter() { //여기서 인상깊게 봐야하는건 레이블에 마우스 리스너를 붙힌다. 
			// 중요한게 컨텐트 펜이 붙히는게 아니라는거 꼭 기억.
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource(); // 레이블의 위치 가져오기
				int math = (int)(Math.random()*16);
				la.setOpaque(true); // 배경색이 보이게 설정.
				la.setBackground(color[math]);
				c.add(la); // 컨텐트펜에 레이블 붙히기.
			}
		});
		*/
		setSize(300,400);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_6();
	}

}
