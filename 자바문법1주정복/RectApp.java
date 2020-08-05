package 자바문법1주정복;
import java.util.*;
public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.print(">> ");
		rect.width = input.nextInt();
		rect.height = input.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		input.close();
	}

}
