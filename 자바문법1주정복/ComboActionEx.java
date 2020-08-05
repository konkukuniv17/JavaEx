package 자바문법1주정복;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	private String [] fruits = { "사과" , "바나나", " 키위"};
	private ImageIcon [] images = { new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu4.jpg"), 
								new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu1.jpg"),			
								new ImageIcon("C:/Users/건우/OneDrive/바탕 화면/이미지저장소/jjangu2.jpg")};
	private JLabel imgLabel = new JLabel(images[0]);
	
	public ComboActionEx() {
		setTitle("콤보박스 활용  예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(fruits); // 콤보박스 생성
		c.add(combo); c.add(imgLabel);

		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource(); // Action 이벤트가 발생한 콤보박스 알아내기
				int index = cb.getSelectedIndex(); // 콤보박스의 선택된 아이템의 인덱스 번호 알아내기
				imgLabel.setIcon(images[index]); // 인덱스의 이미지를 이미지 레이블에 출력
			}
		});
		
		setSize(300,250);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ComboActionEx();
	}
}
