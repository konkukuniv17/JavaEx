package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame{

	public ButtonImageEx() {
		super("전화받는 버튼 이미지로 구현");
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// 3개의 이미지를 읽어 들인다.
		ImageIcon normalIcon = new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu2.jpg");
		ImageIcon pressedIcon = new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu3.jpg");
		
		
		// 3개의 아이코능ㄹ 가진 버튼 컴포넌트 생성
		JButton btn = new JButton("call~~",normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonImageEx();
	}

}
