package 자바문법1주정복;
import javax.swing.*;
import java.awt.*;

public class ch08_345p extends JFrame{
	public ch08_345p() {
		setTitle("배치 관리자를 사용하지 않고 배치하는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("헬로, 버튼 눌러줘!");
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
