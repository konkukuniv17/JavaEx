package �ڹٹ���1������;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ch10_9and10 extends JFrame{
	
	int index=0;
	public ch10_9and10() {
		super("�ܾ���� �����");
		HashMap<String,String> dic = new HashMap<String,String>();

		JLabel la = new JLabel(index + " ");
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
			
		
		JTextArea ta = new JTextArea(10,20); // ���ٿ� 10�� 20�� �Է°��� 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("����"));
		c.add(tf1);
		c.add(new JLabel("�ѱ�"));
		c.add(tf2);
		
		JButton btn1 = new JButton("����");
		JButton btn2 = new JButton("ã��");
		JButton btn3 = new JButton("����");
		JButton btn4 = new JButton("��κ���");
		
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.magenta);
		btn4.setBackground(Color.LIGHT_GRAY);
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // ���� ��ư ������ �۵�
				String key = tf1.getText(); // ���� �ؽ�Ʈ�ʵ� ��������
				String value = dic.get(key); // Ű�� ���ؼ� ���εǴ� ���� ������ ����
				
				if(value != null) {
					dic.put(tf1.getText(), tf2.getText());
					ta.append("����("+ tf1.getText() + "," + tf2.getText() + ")\n");
				}
				else{
					dic.put(tf1.getText(), tf2.getText());
					ta.append("����("+ tf1.getText() + "," + tf2.getText() + ")\n");
					la.setText(++index + " ");
				}
			
			}
		});
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // ã�� ��ư ������ �۵�
				String key = tf1.getText(); // ���� �ؽ�Ʈ�ʵ� ��������
				String value = dic.get(key); // Ű�� ���ؼ� ���εǴ� ���� ������ ����
				if(value == null) {
					tf2.setText("����");
				}
				else
					tf2.setText(value);
				// ���� ��ġ�ϴ°� ������ ������ ��������.
			}
		});
		
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // ���� ��ư ������ �۵�
				String key = tf1.getText(); // ���� �ؽ�Ʈ�ʵ� ��������
				String value = dic.get(key); // Ű�� ���ؼ� ���εǴ� ���� ������ ����
				if(value == null) {
					value = "����";
					index++;
				}
				ta.append("����("+ tf1.getText() + "," + value+ ")\n");
				la.setText(--index + " ");
				dic.remove(key);		
			}
		});
		
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // ��� ���� ��ư ������ �۵�
				Set<String> keys = dic.keySet(); // ��� Ű�� �޾ƿ�	
				Iterator<String> it = keys.iterator(); // Set�� �����ϴ� Iterator ����
				ta.setText(""); // �ؽ�Ʈ����� ���� 
				
				while(it.hasNext()) {
					String key = it.next();
					String value = dic.get(key);
					ta.append("�ܾ� (" + key + ","+value+")\n");
				}
			}
		});
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		
		c.add(la);
		
		c.add(new JScrollPane(ta));
		
		setSize(350,350);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_9and10();
	}

}
