package ch08_openchallenge;

import java.awt.*;
import javax.swing.*;



class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY); // 배경색 설정
		setLayout(new FlowLayout());
		add(new JButton("Open")); // 현재 패널에 버튼 부착
		add(new JButton("Read")); // 현재 패널에 버튼 부착
		add(new JButton("Close")); // 현재 패널에 버튼 부착	 
	}
	
	/*
	public NorthPanel() {
		Container ContentPane = new Container(); // 이 코드 부분 잘못 되었는데 getContentPane() 이지 new 쓰는거 아니다.
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
		setLayout(null); // 배치관리자 삭제, 절대 위치에 컴포넌트 삽입
		
		JLabel a = new JLabel("Hello Java!"); // "Java" 문자열을 레이블 객체로 생성
		a.setSize(100,20);
		a.setLocation(100, 50); // 문자열의 위치 지정
		add(a); // // 현재 패널에 "Java" 문자열 부착
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
		super("Open Challenge 8"); // 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 두 개의 패널을 붙인다.
		add(new NorthPanel(), BorderLayout.NORTH); // NorthPanel을 프레임의 NORTH 영역에 부착한다.
		add(new CenterPanel(), BorderLayout.CENTER); // CenterPanel을 프레임의 CENTER 영역에 부착한다.
		setSize(300,200);
		setVisible(true);
		
		/*super("오픈 첼린지 8 건우가 직접한다!");
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
