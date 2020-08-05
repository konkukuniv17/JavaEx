package 자바문법1주정복;

import java.awt.*;
import javax.swing.*;

public class ch08_2 extends JFrame {

	public ch08_2(){
		setTitle("boarder layout practice ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(30,20));
		
		contentPane.add(new JButton("add"),BorderLayout.NORTH);
		contentPane.add(new JButton("div"),BorderLayout.EAST);
		contentPane.add(new JButton("mul"),BorderLayout.WEST);
		contentPane.add(new JButton("sub"),BorderLayout.SOUTH);
		contentPane.add(new JButton("calcul"),BorderLayout.CENTER);
		
		setSize(400,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch08_2();
	}

}
