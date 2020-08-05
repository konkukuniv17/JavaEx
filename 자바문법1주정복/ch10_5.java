package 자바문법1주정복;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ch10_5 extends JFrame{

	//private JTextField tf = new JTextField(20); // 한줄에 20개 입력가능
	private JTextArea ta = new JTextArea(7,20); // 한줄에 20개 입력가능. 7줄 입력창
	
	public ch10_5() {
		super("파일 저장");
		createMenu();
		Container c = getContentPane();
		c.add(new JScrollPane(ta)); // TextArea는 스크롤 기능을 지원받기 위해 이래 사용해야한다.
		
		
		
		setSize(500,400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("파일");
		JMenuItem item = new JMenuItem("저장");
		
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("이름을 입력하세요.");
				String filename = "C:/Users/건우/OneDrive/바탕 화면/";
				try {
					FileWriter fout = new FileWriter(filename + name);
					String t = ta.getText();
					StringTokenizer st = new StringTokenizer(ta.getText(),"\n");
				
					while(st.hasMoreTokens()) {
						fout.write(st.nextToken());
						fout.write("\r\n");
					}
				fout.close();
				}
				catch(IOException e1) {}
			}
		});
		
		screenMenu.add(item);
		
		mb.add(screenMenu);
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_5();
	}

}
