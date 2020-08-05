package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{

	public TextFieldEx() {
		super("텍스트필드 만들기 예제");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름   "));
		c.add(new JTextField(20)); // 창의 열 갯수
		c.add(new JLabel("학과   "));
		c.add(new JTextField("컴퓨터공학과",20));
		c.add(new JLabel("주소   "));
		c.add(new JTextField("서울시.... ",20));
		
		setSize(300,150);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
