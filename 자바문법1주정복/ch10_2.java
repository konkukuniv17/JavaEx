package �ڹٹ���1������;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ch10_2 extends JFrame{

	public ch10_2() {
		super("�޴� �����");
		createMenu();
		setSize(300,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenmenu1 = new JMenu("����");
		JMenu screenmenu2 = new JMenu("����");
		JMenu screenmenu3 = new JMenu("����");
		JMenu screenmenu4 = new JMenu("�Է�");
		
		JMenuItem [] menuItem = new JMenuItem [2];
		String[] itemTitle = {"ȭ�� Ȯ��", "�� ����"};
		
		screenmenu3.add(itemTitle[0]);
		screenmenu3.addSeparator();
		screenmenu3.add(itemTitle[1]);
		
		mb.add(screenmenu1);
		mb.add(screenmenu2);
		mb.add(screenmenu3);
		mb.add(screenmenu4);
		
		setJMenuBar(mb);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_2();
	}

}
