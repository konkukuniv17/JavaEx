package 자바문법1주정복;


class Adder2{
	private int x,y;
	public Adder2(int x, int y) {this.x = x ;this.y =y;}
	public int add() { return x + y; }
}

public class ch06_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder2 adder = new Adder2(2,5);
		System.out.println(adder.add());
		
	}

}
