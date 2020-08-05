package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread {
	private JLabel timerLabel;// Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; // Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0; // Ÿ�̸� ī��Ʈ ��
		while(true) { // ���� ����
			timerLabel.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� ���
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

public class ch12_476p extends JFrame {
	public ch12_476p() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); // ���̺��� ����Ʈ�ҿ� ����
		
		// Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(250,150);
		setVisible(true);
		
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.
	}
	public static void main(String[] args) {
		new ch12_476p();
	}
}