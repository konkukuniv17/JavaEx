package �ڹٹ���1������;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch10_8 extends JFrame{
	
	JLabel [] label = new JLabel[10]; // �迭�� �� ���۷��� 10�� ����
	Container c = getContentPane();
	int index=0;
	listener listener = new listener(); // ������ Ŭ������ ������ ���� ����.
	
	public ch10_8() {
		this.setTitle("Ten ���̺� Ŭ��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		
		c.setLayout(null);
		
		create();
		
		this.setSize(310, 310);
		this.setVisible(true);
	}
	
	public void create() {
		for(int i = 0; i < label.length; i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			label[i] = new JLabel(Integer.toString(i));
			label[i].setBounds(x, y, 20, 20);
			label[i].setForeground(Color.MAGENTA);
			label[i].addMouseListener(listener);
			c.add(label[i]);
		}
	}
	
	class listener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			JLabel la = (JLabel)e.getSource(); 			
			int n = Integer.parseInt(la.getText()); // ���ڿ��� ���ڷ�
			if(index == n) {
				la.setVisible(false);
				index++;
				if(index == 10) {
					new ch10_8();
					dispose(); // ������ ���� â �ݱ�
					index = 0;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_8();
	}

	}
