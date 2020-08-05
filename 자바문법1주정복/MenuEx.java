package 자바문법1주정복;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{

	public MenuEx() {
		super("메뉴 만들기 예제");
		createMenu(); //메뉴 생성 및 프레임 삽입
		setSize(200,250);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		JMenu screenMenu = new JMenu("Screen"); // Screen 메뉴 생성
		
		//Screen 메뉴에 메뉴아이템 생성 삽입
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator(); // 분리선 삽입.
		screenMenu.add(new JMenuItem("Exit"));
		
		//메뉴바에 삽입
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Score"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		//메뉴바를 프레임에 부착
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
