package �ڹٹ���1������;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ch09_6 extends JFrame{

	public ch09_6() {
		this.setTitle("�÷� ������ 3x4");

		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 4));
		
		JLabel [] label = new JLabel [12];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};
		
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true); // ������ ���̰� ����.
			label[i].setBackground(Color.WHITE); // �� ���̺��� �� ����.
			
			label[i].addMouseListener(new MouseAdapter() { //���⼭ �λ��� �����ϴ°� ���̺� ���콺 �����ʸ� ������. 
				// �߿��Ѱ� ����Ʈ ���� �����°� �ƴ϶�°� �� ���.
				public void mousePressed(MouseEvent e) {
					JLabel la = (JLabel)e.getSource(); // ���̺��� ��ġ ��������
					Container c = la.getParent(); // ���̺��� �����̳�(����Ʈ ��)			
					int math = (int)(Math.random()*16);
					la.setOpaque(true); // ������ ���̰� ����.
					la.setBackground(color[math]);
					c.add(la); // ����Ʈ�濡 ���̺� ������.
				}
			});
			
			c.add(label[i]); // ����Ʈ�濡 ���̺� ������.
		}
		/* for�� �ۿ��� �θ��� �ȵȴٴ� ���� �����ַ��� �ּ����� ���ܵξ���.
		 * 
		c.addMouseListener(new MouseAdapter() { //���⼭ �λ��� �����ϴ°� ���̺� ���콺 �����ʸ� ������. 
			// �߿��Ѱ� ����Ʈ ���� �����°� �ƴ϶�°� �� ���.
			public void mousePressed(MouseEvent e) {
				JLabel la = (JLabel)e.getSource(); // ���̺��� ��ġ ��������
				int math = (int)(Math.random()*16);
				la.setOpaque(true); // ������ ���̰� ����.
				la.setBackground(color[math]);
				c.add(la); // ����Ʈ�濡 ���̺� ������.
			}
		});
		*/
		setSize(300,400);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_6();
	}

}
