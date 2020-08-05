package �ڹٹ���1������;
import java.util.*;
abstract class Shape{
	public abstract boolean insert(String x);
	public abstract int delete(int x);
	public abstract void show();
}

class App extends Shape {
	
	private String[] element;
	private int index;
	
	public App(int capacity) {
		element = new String[capacity];
		index = 0; // ������ �� �迭�� �ε��� 
	}
	
	public void show() {
		for(int i=0; i<index; i++)
		{
			String v = element[i];
			if(v.equals(" "))
				continue;
			System.out.println("["+i+"]>>"+ v);
		}
	}
	
	@Override
	public int delete(int x) {
		if(index == 0) // ������ �����
			return 1;
		element[x]=" ";
		//index--; // ���� ������ ����
		return 1;
	}
	
	
	public boolean insert(String x)
	{
		if(index == element.length)
			return false; // ������ �� á��
		element[index++] = x; // ��� ���ÿ� ���� �� ���� ������ ����
		return true;
	}
}


public class ch05_6 {

	public static String sel() {
		Scanner sel = new Scanner(System.in);
		System.out.println("���� ���� Line(1), Rect(2), Circle(3) >> ");
		int temp;
		String val = null;
		
		temp = sel.nextInt();
		
		if(temp == 1)
			val = "Line";
		else if(temp == 2)
			val = "Rect";
		else if(temp == 3)
			val = "Circle";
		return val;
	}
	
	public static int del() {
		Scanner del = new Scanner(System.in);
		System.out.println("������ ������ ��ġ>> ");
		int u = del.nextInt();
		return u;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;
		App a = new App(10);
		
		
		while(true)
		{
			System.out.println("����(1),����(2),��� ����(3), ����(4) >> ");
			choice = input.nextInt();
			if(choice == 4)
			{
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			else if(choice == 1)
			{
				String u = sel();
				a.insert(u);
			}
			else if(choice == 2)
			{
				int k = del();
				a.delete(k);
			}
			else if(choice == 3)
			{
				a.show();
			}
			
			
		}
		
		input.close();
		
	}

}

