package �ڹٹ���1������;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch10_1 extends JFrame{
	
	public ch10_1() {
	super("4 Images");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new GridLayout(1,4,10,10));
	
	/*
	ImageIcon img [] = new ImageIcon [4];
	img[0] = new ImageIcon("images/img1.jpg");
	img[1] = new ImageIcon("images/img2.jpg");
	img[2] = new ImageIcon("images/img3.jpg");
	img[3] = new ImageIcon("images/img4.jpg");
	*/
	
	ImageIcon [] images = { new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu4.jpg"), 
			new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu3.jpg"),
			new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu1.jpg"),			
			new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu2.jpg")};
	
	for(int i=0; i<images.length; i++)
		c.add(new JLabel(images[i]));
	
	setSize(500, 200);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_1();
	}

}
