package �ڹٹ���1������;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class listenerEx implements ActionListener {
	public void actionPerformed(ActionEvent e) // �������̽��� ����Ǿ� �ִ� �߻�޼ҵ� ���̴�.
	{
		JButton b = (JButton)e.getSource(); // ����ڰ� Ŭ���� ��ư �˾Ƴ���
		
		if(b.getText().equals("�׼�")) // Ŭ���� ��ư�� ���ڿ���  ~ ��
			b.setText("Action"); // �� ���ڿ��� �ٲ۴�.
		else
			b.setText("�׼�"); 
	}
}

public class ch09_361p extends JFrame{

	public ch09_361p() {
		super("�׼� Action �ٲٱ� ����.");
		Container c = getContentPane(); // �̰� �ſ� �߿� ����Ʈ �� �˾Ƴ��°��� new ���°� �ƴϴ�.
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		listenerEx ac = new listenerEx(); // ���� ���� ������ �ν��Ͻ� ����.
		JButton btn = new JButton("�׼�"); // ��ư �����
		btn.addActionListener(ac); // ���� ��ư�� �����ʸ� ������.
		c.add(btn);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch09_361p();
	}

}
