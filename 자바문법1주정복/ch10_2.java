package 자바문법1주정복;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ch10_2 extends JFrame{

	public ch10_2() {
		super("메뉴 만들기");
		createMenu();
		setSize(300,200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenmenu1 = new JMenu("파일");
		JMenu screenmenu2 = new JMenu("편집");
		JMenu screenmenu3 = new JMenu("보기");
		JMenu screenmenu4 = new JMenu("입력");
		
		JMenuItem [] menuItem = new JMenuItem [2];
		String[] itemTitle = {"화면 확대", "쪽 윤곽"};
		
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
