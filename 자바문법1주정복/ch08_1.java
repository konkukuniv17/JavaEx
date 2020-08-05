package 자바문법1주정복;
import java.awt.*;
import javax.swing.*;

public class ch08_1 extends JFrame{
	
	public ch08_1(){
		setTitle("let's study java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		//contentPane.setLayout(null);
		
		//JLabel la = new JLabel("헬로, 버튼 눌러줘!");
		//la.setLocation(130,50);
		//la.setSize(400,200);
		//contentPane.add(la);
		setSize(400,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch08_1();
	}

}
