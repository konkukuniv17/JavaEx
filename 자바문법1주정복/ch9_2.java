package �ڹٹ���1������;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class ch9_2 extends JFrame{
	
	Container c = getContentPane();
	
	public ch9_2(){
		super("Ű ����Ű �� ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		c.setBackground(Color.CYAN);
		c.addKeyListener(new change()); // �����ʸ� �����ٴ� ����.
		
		setSize(300,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class change extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode){
				case KeyEvent.VK_R : c.setBackground(Color.RED); break;
			}
		}
		
		public void keyReleased(KeyEvent e) { // ������ ���� ���ǻ����� �޼ҵ� ���� �߻�� �ٸ��� �ۼ��� ��� ���������� �۵����� ���� �� �ִ�.
			int keyCode = e.getKeyCode();
			switch(keyCode){
				case KeyEvent.VK_R : c.setBackground(Color.CYAN); break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch9_2();
	}

}
