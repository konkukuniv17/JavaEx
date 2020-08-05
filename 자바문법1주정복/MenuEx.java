package �ڹٹ���1������;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{

	public MenuEx() {
		super("�޴� ����� ����");
		createMenu(); //�޴� ���� �� ������ ����
		setSize(200,250);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); // �޴��� ����
		JMenu screenMenu = new JMenu("Screen"); // Screen �޴� ����
		
		//Screen �޴��� �޴������� ���� ����
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator(); // �и��� ����.
		screenMenu.add(new JMenuItem("Exit"));
		
		//�޴��ٿ� ����
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Score"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		//�޴��ٸ� �����ӿ� ����
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
