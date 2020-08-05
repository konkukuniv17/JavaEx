package 자바문법1주정복;
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
		index = 0; // 앞으로 들어갈 배열의 인덱스 
	}
	
	@Override
	public int length() {
		return index;
	}
	
	@Override
	public String pop() {
		if(index == 0) // 스택이 비었음
			return null;
		index--; // 스택 포인터 감소
		return element[index];
	}
	
	@Override
	public boolean push(String ob) {
		if(index == element.length)
			return false; // 스택이 다 찼음
		element[index++] = ob; // 요소 스택에 저장 후 스택 포인터 증가
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
