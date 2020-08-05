package 자바문법1주정복;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ch10_9and10 extends JFrame{
	
	int index=0;
	public ch10_9and10() {
		super("단어사전 만들기");
		HashMap<String,String> dic = new HashMap<String,String>();

		JLabel la = new JLabel(index + " ");
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
			
		
		JTextArea ta = new JTextArea(10,20); // 한줄에 10개 20개 입력가능 
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("영어"));
		c.add(tf1);
		c.add(new JLabel("한글"));
		c.add(tf2);
		
		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("찾기");
		JButton btn3 = new JButton("삭제");
		JButton btn4 = new JButton("모두보기");
		
		btn1.setBackground(Color.yellow);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.magenta);
		btn4.setBackground(Color.LIGHT_GRAY);
		
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // 저장 버튼 누를때 작동
				String key = tf1.getText(); // 영어 텍스트필드 가져오고
				String value = dic.get(key); // 키에 대해서 매핑되는 정보 가지고 오기
				
				if(value != null) {
					dic.put(tf1.getText(), tf2.getText());
					ta.append("변경("+ tf1.getText() + "," + tf2.getText() + ")\n");
				}
				else{
					dic.put(tf1.getText(), tf2.getText());
					ta.append("삽입("+ tf1.getText() + "," + tf2.getText() + ")\n");
					la.setText(++index + " ");
				}
			
			}
		});
		
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // 찾기 버튼 누를때 작동
				String key = tf1.getText(); // 영어 텍스트필드 가져오고
				String value = dic.get(key); // 키에 대해서 매핑되는 정보 가지고 오기
				if(value == null) {
					tf2.setText("없음");
				}
				else
					tf2.setText(value);
				// 만약 일치하는게 없으면 공란이 보여진다.
			}
		});
		
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // 삭제 버튼 누를때 작동
				String key = tf1.getText(); // 영어 텍스트필드 가져오고
				String value = dic.get(key); // 키에 대해서 매핑되는 정보 가지고 오기
				if(value == null) {
					value = "없음";
					index++;
				}
				ta.append("삭제("+ tf1.getText() + "," + value+ ")\n");
				la.setText(--index + " ");
				dic.remove(key);		
			}
		});
		
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { // 모두 보기 버튼 누릴때 작동
				Set<String> keys = dic.keySet(); // 모든 키를 받아옴	
				Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
				ta.setText(""); // 텍스트에어리어 비우고 
				
				while(it.hasNext()) {
					String key = it.next();
					String value = dic.get(key);
					ta.append("단어 (" + key + ","+value+")\n");
				}
			}
		});
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		
		c.add(la);
		
		c.add(new JScrollPane(ta));
		
		setSize(350,350);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_9and10();
	}

}
