package 자바문법1주정복;

public class ch06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(3,20);
		System.out.println(a); //a 는 자동으로 toString()으로 변환됨.
	}

}

class MyPoint{
	int x, y;
	public MyPoint(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() { 
		return getClass().getName() + "(" + x + "," + y+ ")";
	}
}
