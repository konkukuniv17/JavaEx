package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ch09_4 extends JFrame{
	private Font f;
	private int size;
	
	public ch09_4() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); // ��ũ�� �߾ӿ� ��ġ�ϱ�.
				
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		
		c.addKeyListener(new KeyListener() { // �̰� �ٷ� �����ϴ� ����. ��ʹ̽� Ŭ������� �ϳ�? �Ƹ� �׷�����.
			public void keyPressed(KeyEvent e) { // Ű�� ������
            	f = label.getFont(); // ���� ��Ʈ ��������
				size = f.getSize(); // ũ��� �˾Ƴ���
				if(e.getKeyChar() == '+') { 
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-' && size > 10) { // 5���Ϸ� �۾����� �ʰ� �ϱ�.
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			public void keyReleased(KeyEvent e) {} // �����ʶ� �Ƚᵵ �̷� �ص־� ��
			public void keyTyped(KeyEvent e) {} // �����ʶ� �Ƚᵵ �̷� �ص־� ��
		});
		
		c.add(label); // ���� ����Ʈ�濡 �����ֱ�! 
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_4();
	}

}
