package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{

	public LabelEx() {
		super("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// ���ڿ� ���̺� ����
		JLabel textLabel = new JLabel("���ӽ� ���� �Դϴ�!");
		
		// �̹��� ���̺� ����
		ImageIcon img = new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/adad.png"); // �̹��� �ε�
		// �Ӽ�â�� �������÷� ���� ������ �Է��� ���� �����÷� �־�� �Ѵ�.
		JLabel imageLabel = new JLabel(img); // ���̺� ����

		// ���ڿ� �̹��� ��� ���� ���Ը� ����
		ImageIcon icon = new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/adafaf.png"); // �̹��� �ε�
		JLabel label = new JLabel("Ŀ������ �ϽǷ���~, ��ȭ���̼�",icon,SwingConstants.CENTER); // ���̺� ����
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
