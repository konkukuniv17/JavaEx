package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkBox extends JFrame{

	private JCheckBox [] fruits = new JCheckBox [3]; // 체크박스 3개 만들고
	private String [] names = {"사과", "배", "사과"}; // 이름도 배열로 관리하기
	
	private JLabel sumLabel; // 합을 출력할 레이블
	
	public checkBox() {
		
		super("체크박스 만들기 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원 배 500원 체리 20000원")); // 레이블 만들어서 flow레이아웃 가장 최정상에 붙히고 
		
		MyItemListener listener = new MyItemListener(); // 체크박스의 상태가 변하는 경우는 아이템 리스너 호출한다.
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); // 체크박스 만들고
			fruits[i].setBorderPainted(true); // 체크박스의 외곽선이 보이도록 설정
			c.add(fruits[i]); // 체크박스를 컨텐트팬에 삽입
			fruits[i].addItemListener(listener); // 체크박스에 리스너 달아주기 -- 컨텐트팬에 안넣어도 되는데 체크박스의 이벤트를 확인하는 거니까 체크박스에 달아야한다.
		}
		
		sumLabel = new JLabel("현재 0원 입니다");
		c.add(sumLabel); // 이걸 넣어줘야 리스너 호출에 대한 setText가 출력된다.
		
		
		
		//JCheckBox apple = new JCheckBox("사과");
		//JCheckBox pear = new JCheckBox("배",true);
		//JCheckBox cherry = new JCheckBox("체리");
		
		
		//c.add(apple); c.add(pear); c.add(cherry);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		private int sum = 0; 
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) { // 체크박스가 선택된 경우
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			}
			else { // 체크박스가 헤제된 경우
				if(e.getItem() == fruits[0])
					sum -= 100;
				else if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
				
			}
			sumLabel.setText("현재" + sum + "원 입니다."); // 합출력
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new checkBox();
	}

}
