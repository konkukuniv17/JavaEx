package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{

	public TextFieldEx() {
		super("�ؽ�Ʈ�ʵ� ����� ����");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�   "));
		c.add(new JTextField(20)); // â�� �� ����
		c.add(new JLabel("�а�   "));
		c.add(new JTextField("��ǻ�Ͱ��а�",20));
		c.add(new JLabel("�ּ�   "));
		c.add(new JTextField("�����.... ",20));
		
		setSize(300,150);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
