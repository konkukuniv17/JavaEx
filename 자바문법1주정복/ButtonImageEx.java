package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame{

	public ButtonImageEx() {
		super("��ȭ�޴� ��ư �̹����� ����");
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// 3���� �̹����� �о� ���δ�.
		ImageIcon normalIcon = new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu2.jpg");
		ImageIcon pressedIcon = new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu3.jpg");
		
		
		// 3���� �����ڴɤ� ���� ��ư ������Ʈ ����
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
