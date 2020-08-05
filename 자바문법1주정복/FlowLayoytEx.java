package 자바문법1주정복;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class FlowLayoytEx extends JFrame{
	public FlowLayoytEx() {
		setTitle("FlowLayoytEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("calculate"));
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoytEx();
	}

}
