package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{

	public LabelEx() {
		super("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		// 문자열 레이블 생성
		JLabel textLabel = new JLabel("제임스 고슬링 입니다!");
		
		// 이미지 레이블 생성
		ImageIcon img = new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/adad.png"); // 이미지 로딩
		// 속성창은 역슬래시로 복사 되지만 입력할 때는 슬래시로 넣어야 한다.
		JLabel imageLabel = new JLabel(img); // 레이블 생성

		// 문자열 이미지 모두 가진 레입르 생성
		ImageIcon icon = new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/adafaf.png"); // 이미지 로딩
		JLabel label = new JLabel("커피한잔 하실래예~, 전화주이소",icon,SwingConstants.CENTER); // 레이블 생성
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}
