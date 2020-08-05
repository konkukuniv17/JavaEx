package 자바문법1주정복;
import java.util.*;

abstract class Calculator {
	protected int a,b;
	abstract protected int calc();

	protected void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 >> ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
	}
	
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은"+ res);
	}
	
}

class substracter extends Calculator{

	@Override
	protected int calc() {
		return this.a+this.b;
	}
	
}

class Adder extends Calculator{

	@Override
	protected int calc() {
		// TODO Auto-generated method stub
		return this.a-this.b;
	}

}

public class Ch05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder adder = new Adder();
		substracter sub = new substracter();
		
		adder.run();
		sub.run();

	}

}
