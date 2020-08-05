package �ڹٹ���1������;
import java.util.*;

interface StackInterface { 
	int length();
	String pop();
	boolean push(String ob);
}

class StringStack implements StackInterface {
	
	private String[] element;
	private int index;
	
	public StringStack(int capacity) {
		element = new String[capacity];
		index = 0; // ������ �� �迭�� �ε��� 
	}
	
	@Override
	public int length() {
		return index;
	}
	
	@Override
	public String pop() {
		if(index == 0) // ������ �����
			return null;
		index--; // ���� ������ ����
		return element[index];
	}
	
	@Override
	public boolean push(String ob) {
		if(index == element.length)
			return false; // ������ �� á��
		element[index++] = ob; // ��� ���ÿ� ���� �� ���� ������ ����
		return true;
	}
}

public class ch05_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack a = new StringStack(10);
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
			String text = input.next();
			a.push(text);
		}
		
		int count = a.length();
		for (int i=0;i<count; i++)
			System.out.print(a.pop()+" ");
		
		input.close();
	}

}
