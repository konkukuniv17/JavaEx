package �ڹٹ���1������;

public class ch06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(3,20);
		System.out.println(a); //a �� �ڵ����� toString()���� ��ȯ��.
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
