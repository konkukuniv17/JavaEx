package �ڹٹ���1������;
import javax.swing.*;
import java.awt.*;

public class ch08_345p extends JFrame{
	public ch08_345p() {
		setTitle("��ġ �����ڸ� ������� �ʰ� ��ġ�ϴ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("���, ��ư ������!");
		la.setLocation(130,50);
		la.setSize(200,20);
		contentPane.add(la);
		
		for(int i=0; i<=9; i++)
		{
			JButton b =new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			
			contentPane.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch08_345p();
	}

}
