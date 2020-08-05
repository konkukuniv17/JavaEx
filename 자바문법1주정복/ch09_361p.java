package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class listenerEx implements ActionListener {
	public void actionPerformed(ActionEvent e) // 인터페이스에 선언되어 있는 추상메소드 명이다.
	{
		JButton b = (JButton)e.getSource(); // 사용자가 클릭한 버튼 알아내기
		
		if(b.getText().equals("액션")) // 클릭한 버튼의 문자열이  ~ 면
			b.setText("Action"); // 그 문자열을 바꾼다.
		else
			b.setText("액션"); 
	}
}

public class ch09_361p extends JFrame{

	public ch09_361p() {
		super("액션 Action 바꾸기 연습.");
		Container c = getContentPane(); // 이거 매우 중요 컨테트 팬 알아내는거지 new 쓰는거 아니다.
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		listenerEx ac = new listenerEx(); // 내가 만든 리스너 인스턴스 생성.
		JButton btn = new JButton("액션"); // 버튼 만들고
		btn.addActionListener(ac); // 만든 버튼에 리스너를 붙힌다.
		c.add(btn);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_361p();
	}

}
