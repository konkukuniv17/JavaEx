package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaEx extends JFrame{

	private JTextField tf = new JTextField(20); // ���ٿ� 20�� �Է°���
	private JTextArea ta = new JTextArea(7,20); // ���ٿ� 20�� �Է°���. 7�� �Է�â
	
	public JTextAreaEx() {
		super("�ؽ�Ʈ���� ����� ����");
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("�Է��� <Enter> Ű�� �Է��ϼ���")); 
		c.add(tf); 
		c.add(new JScrollPane(ta)); // TextArea�� ��ũ�� ����� �����ޱ� ���� �̷� ����ؾ��Ѵ�.
		
		// �ؽ�Ʈ �ʵ忡 ������ ����ϱ� ( Area �ƴ����� ���� )
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); // ���� ���� �ʵ� ��������
				ta.append(t.getText() + "\n"); // �ؽ�Ʈ�ʵ��� ���ڿ��� �ؽ�ƮArea�� ������.
				t.setText(" "); // �׸��� �ؽ�Ʈ�ʵ� ���
			}
		});
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaEx();
	}

}
