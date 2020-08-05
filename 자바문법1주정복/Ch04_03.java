package 자바문법1주정복;
import java.util.*;
public class Ch04_03 {

	public static void main(String[] args) {
		int i;
		int total=0;
		Scanner input = new Scanner(System.in);
		int w,h;
		Rect [] r = new Rect[4];
		for(i=0; i<4; i++)
		{
			System.out.println(i+1 + " 너비와 높이 >> ");
			w = input.nextInt();
			h = input.nextInt();
			
			r[i] = new Rect(w,h);
			total += r[i].getArea();
		}
		System.out.println("저장하였습니다....");
		System.out.println("사각형의 전체 합은 "+ total);
		input.close();
	}

}

class Rect{
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() { return width * height; }
	
}
