package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkBox extends JFrame{

	private JCheckBox [] fruits = new JCheckBox [3]; // üũ�ڽ� 3�� �����
	private String [] names = {"���", "��", "���"}; // �̸��� �迭�� �����ϱ�
	
	private JLabel sumLabel; // ���� ����� ���̺�
	
	public checkBox() {
		
		super("üũ�ڽ� ����� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("��� 100�� �� 500�� ü�� 20000��")); // ���̺� ���� flow���̾ƿ� ���� ������ ������ 
		
		MyItemListener listener = new MyItemListener(); // üũ�ڽ��� ���°� ���ϴ� ���� ������ ������ ȣ���Ѵ�.
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); // üũ�ڽ� �����
			fruits[i].setBorderPainted(true); // üũ�ڽ��� �ܰ����� ���̵��� ����
			c.add(fruits[i]); // üũ�ڽ��� ����Ʈ�ҿ� ����
			fruits[i].addItemListener(listener); // üũ�ڽ��� ������ �޾��ֱ� -- ����Ʈ�ҿ� �ȳ־ �Ǵµ� üũ�ڽ��� �̺�Ʈ�� Ȯ���ϴ� �Ŵϱ� üũ�ڽ��� �޾ƾ��Ѵ�.
		}
		
		sumLabel = new JLabel("���� 0�� �Դϴ�");
		c.add(sumLabel); // �̰� �־���� ������ ȣ�⿡ ���� setText�� ��µȴ�.
		
		
		
		//JCheckBox apple = new JCheckBox("���");
		//JCheckBox pear = new JCheckBox("��",true);
		//JCheckBox cherry = new JCheckBox("ü��");
		
		
		//c.add(apple); c.add(pear); c.add(cherry);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		private int sum = 0; 
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { // üũ�ڽ��� ���õ� ���
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			}
			else { // üũ�ڽ��� ������ ���
				if(e.getItem() == fruits[0])
					sum -= 100;
				else if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
				
			}
			sumLabel.setText("����" + sum + "�� �Դϴ�."); // �����
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new checkBox();
	}

}
