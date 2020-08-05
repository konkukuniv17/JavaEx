package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{

	private String [] fruits = { "사과" , "바나나", " 키위", "망고", "배", "복숭아", "베리", "딸기", "블랙베리" };
	private ImageIcon [] images = { new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu4.jpg"), 
								new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu4.jpg"),			
								new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu4jpg"),		
								new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu4jpg")};
	public ListEx() {
		super("리스트 만들기 예제");
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<String> strList = new JList<String>(fruits); // 스트링 사용시 리스트
		c.add(strList);
		
		JList<ImageIcon> imageList = new JList<ImageIcon>(); // 이미지 사용시 리스트
		imageList.setListData(images); // 리스트에 이미지 아이템 삽입
		c.add(imageList);
		
		JList<String> scrollList = new JList<String>(fruits); // 문자열 리스트 생성
		c.add(new JScrollPane(scrollList)); // 리스트를 스크롤 가능하게 하기 위해 JScrollPane에 부착하고, 다시 JScrollPane을 컨텐트팬에 부착함.
	
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
