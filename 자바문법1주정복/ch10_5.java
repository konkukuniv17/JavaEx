package �ڹٹ���1������;

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

	//private JTextField tf = new JTextField(20); // ���ٿ� 20�� �Է°���
	private JTextArea ta = new JTextArea(7,20); // ���ٿ� 20�� �Է°���. 7�� �Է�â
	
	public ch10_5() {
		super("���� ����");
		createMenu();
		Container c = getContentPane();
		c.add(new JScrollPane(ta)); // TextArea�� ��ũ�� ����� �����ޱ� ���� �̷� ����ؾ��Ѵ�.
		
		
		
		setSize(500,400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("����");
		JMenuItem item = new JMenuItem("����");
		
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
				String filename = "C:/Users/�ǿ�/OneDrive/���� ȭ��/";
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
