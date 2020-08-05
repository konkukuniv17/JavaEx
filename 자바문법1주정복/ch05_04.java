package 자바문법1주정복;

public class ch05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint (5,5,"yellow");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}

}

class Point{
	private int x,y;
	public Point (int x, int y) { this.x=x; this.y=y; }
	public int getX() { return x; }
	public int getY() { return y; } 
	
	protected void move ( int x, int y ) { this.x=x; this.y=y; }
}

class ColorPoint extends Point {
	
	String color;
	int x,y;
	public ColorPoint(int x, int y,String color) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public void setPoint(int x, int y) {
		move(x,y);
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void show() {
		System.out.println(this.color +"색으로 (" +this.getX() + "," + this.getY()+")");
	}
}