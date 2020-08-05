package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaEx extends JFrame{

	private JTextField tf = new JTextField(20); // 한줄에 20개 입력가능
	private JTextArea ta = new JTextArea(7,20); // 한줄에 20개 입력가능. 7줄 입력창
	
	public JTextAreaEx() {
		super("텍스트영역 만들기 예제");
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new Label("입력후 <Enter> 키를 입력하세요")); 
		c.add(tf); 
		c.add(new JScrollPane(ta)); // TextArea는 스크롤 기능을 지원받기 위해 이래 사용해야한다.
		
		// 텍스트 필드에 리스너 등록하기 ( Area 아님으로 주의 )
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); // 현재 눌린 필드 가져오고
				ta.append(t.getText() + "\n"); // 텍스트필드의 문자열을 텍스트Area에 붙힌다.
				t.setText(" "); // 그리고 텍스트필드 비움
			}
		});
		setSize(300,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaEx();
	}

}
