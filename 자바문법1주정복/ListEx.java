package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{

	private String [] fruits = { "���" , "�ٳ���", " Ű��", "����", "��", "������", "����", "����", "������" };
	private ImageIcon [] images = { new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu4.jpg"), 
								new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu4.jpg"),			
								new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu4jpg"),		
								new ImageIcon("C:/Users/�ǿ�/OneDrive/���� ȭ��/�̹��������/jjangu4jpg")};
	public ListEx() {
		super("����Ʈ ����� ����");
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits); // ��Ʈ�� ���� ����Ʈ
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); // �̹��� ���� ����Ʈ
		imageList.setListData(images); // ����Ʈ�� �̹��� ������ ����
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits); // ���ڿ� ����Ʈ ����
		c.add(new JScrollPane(scrollList)); // ����Ʈ�� ��ũ�� �����ϰ� �ϱ� ���� JScrollPane�� �����ϰ�, �ٽ� JScrollPane�� ����Ʈ�ҿ� ������.
	
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
