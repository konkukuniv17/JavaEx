package 자바문법1주정복;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ch10_6 extends JFrame{

	JTextField src = new JTextField(8);
	JTextField dest = new JTextField(8);
	int n;
	
	JRadioButton demical = new JRadioButton("demical");
	JRadioButton binary = new JRadioButton("binary");
	JRadioButton octal = new JRadioButton("octal");
	JRadioButton hex = new JRadioButton("hex");
	
	public ch10_6(){
		super(" digit changer");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(src);
		c.add(new JLabel(" -> "));
		c.add(dest);
		
		ButtonGroup g = new ButtonGroup();

		
		g.add(demical);
		g.add(binary);
		g.add(octal);
		g.add(hex);
		
		c.add(demical);
		c.add(binary);
		c.add(octal);
		c.add(hex);
		
		MyItemListener item = new MyItemListener();
		
		demical.addItemListener(item);
		binary.addItemListener(item);
		octal.addItemListener(item);
		hex.addItemListener(item);
		
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			
			n = Integer.parseInt(src.getText());
			
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == binary)
					dest.setText(Integer.toBinaryString(n)); // 십진수를 2진수로
				if(e.getItem() == demical)
					dest.setText(src.getText());	
				if(e.getItem() == octal)
					dest.setText(Integer.toOctalString(n)); // 십진수를 2진수로
				if(e.getItem() == hex)
					dest.setText(Integer.toHexString(n)); // 십진수를 2진수로
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ch10_6();
	}

}
