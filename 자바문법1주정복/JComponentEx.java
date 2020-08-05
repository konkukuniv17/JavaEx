package 자바문법1주정복;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame{

	public JComponentEx() {
		super("제이컴포넌트 공통 메소드 예제다");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("마젠타/옐로우 버튼");
		JButton b2 = new JButton("   disabled button  ");
		JButton b3 = new JButton("getX(),getY()");
		
		b1.setBackground(Color.yellow); // 배경색 설정
		b1.setForeground(Color.MAGENTA); // 글자색 설정
		b1.setFont(new Font("Arial",Font.ITALIC,20)); //폰트 및 글자 크기 설정
		
		b2.setEnabled(false);
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b =(JButton)e.getSource();
				setTitle(b.getX()+ "," + b.getY() );
			}
			
		});
		
		c.add(b1); c.add(b2); c.add(b3);
		setSize(260,200); setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
