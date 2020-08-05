package 자바문법1주정복;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch08_3 extends JFrame{

	public ch08_3(){
		super("flowlayout practice ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
		
		contentPane.add(new JLabel("100 + 200"));
		contentPane.add(new JButton("="));
		contentPane.add(new JLabel("300"));
		//JButton b =new JButton("버튼");
		//contentPane.add(b);
		
		
		setSize(400,200);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch08_3();
	}

}
