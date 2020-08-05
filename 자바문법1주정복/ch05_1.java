package 자바문법1주정복;

public class ch05_1 {

	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5,"waffle");
		w.show();

	}

}

class Circle{
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() {
		return radius;
	}
}

class NamedCircle extends Circle {
	String name;
	public NamedCircle(int radius,String name) {
		super(radius);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	
	public void show() {
		System.out.println(name + ", 반지름 = " + super.getRadius() );
	}
}