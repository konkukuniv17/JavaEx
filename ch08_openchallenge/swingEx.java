package ch08_openchallenge;

import java.awt.*;
import javax.swing.*;



class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY); // ���� ����
		setLayout(new FlowLayout());
		add(new JButton("Open")); // ���� �гο� ��ư ����
		add(new JButton("Read")); // ���� �гο� ��ư ����
		add(new JButton("Close")); // ���� �гο� ��ư ����	 
	}
	
	/*
	public NorthPanel() {
		Container ContentPane = new Container(); // �� �ڵ� �κ� �߸� �Ǿ��µ� getContentPane() ���� new ���°� �ƴϴ�.
		ContentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		ContentPane.add(new JButton("Open"));
		ContentPane.add(new JButton("Read"));
		ContentPane.add(new JButton("Close"));
		ContentPane.setBackground(Color.LIGHT_GRAY);
		
		setSize(300,200);
		setVisible(true);
	}*/
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null); // ��ġ������ ����, ���� ��ġ�� ������Ʈ ����
		
		JLabel a = new JLabel("Hello Java!"); // "Java" ���ڿ��� ���̺� ��ü�� ����
		a.setSize(100,20);
		a.setLocation(100, 50); // ���ڿ��� ��ġ ����
		add(a); // // ���� �гο� "Java" ���ڿ� ����
	}		
	/*public CenterPanel(){
		Container ContentPane = new Container();
		ContentPane.setLayout(null);
		ContentPane.setSize(100,20);
		ContentPane.setLocation(100, 50);
		ContentPane.add(new JLabel("Hello Java"));
		
	}*/
}

public class swingEx extends JFrame{

	public swingEx() {
		super("Open Challenge 8"); // Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �� ���� �г��� ���δ�.
		add(new NorthPanel(), BorderLayout.NORTH); // NorthPanel�� �������� NORTH ������ �����Ѵ�.
		add(new CenterPanel(), BorderLayout.CENTER); // CenterPanel�� �������� CENTER ������ �����Ѵ�.
		setSize(300,200);
		setVisible(true);
		
		/*super("���� ÿ���� 8 �ǿ찡 �����Ѵ�!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container ContentPane = new Container();
		ContentPane.setLayout(new BorderLayout());
		ContentPane.add(new NorthPanel(), BorderLayout.NORTH);
		ContentPane.add(new CenterPanel(),BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new swingEx();
	}

}
