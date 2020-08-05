package 자바문법1주정복;

interface AdderInterface {
	int add(int x, int y);
	int add(int n);
}

class MyAdder implements AdderInterface {
	
	public int add(int x , int y)
	{
		return x+y;
	}
	public int add(int n)
	{
		
		return n*(n+1) / 2; 
	}
}

public class Ch05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
