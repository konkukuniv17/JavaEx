package 자바문법1주정복;
import java.util.Scanner;

public class ch2_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cash;
		int temp;
		System.out.print("돈의 액수를 입력하세여>");
		cash = input.nextInt();
		
		if(cash >= 50000)
		{
			temp = cash / 50000;
			System.out.print("오만원"+temp+"개,");
			cash -= temp*50000;
		}
		else
			System.out.print("오만원  0개,");
		if(cash >= 10000)
		{
			temp = cash / 10000;
			System.out.print("만원"+temp+"개,");
			cash -= temp*10000;
		}
		else
			System.out.print("만원  0개,");
		if(cash >= 1000)
		{
			temp = cash / 1000;
			System.out.print("천원"+temp+"개,");
			cash -= temp*1000;
		}
		else 
			System.out.print("천원  0개,");
		if(cash >= 500)
		{
			temp = cash / 500;
			System.out.print("오백원"+temp+"개,");
			cash -= temp*500;
		}
		else 
			System.out.print("오백원  0개,");
		if(cash >= 100)
		{
			temp = cash / 100;
			System.out.print("백원"+temp+"개,");
			cash -= temp*100;
		}
		else 
			System.out.print("백원  0개,");
		if(cash >= 10)
		{
			temp = cash / 10;
			System.out.print("십원"+temp+"개,");
			cash -= temp*10;
		}
		else  
			System.out.print("십원  0개,");
		if(cash >= 1)
		{
			temp = cash / 1;
			System.out.print("일원"+temp+"개");
			cash -= temp*1;
		}
		else  
			System.out.print("일원  0개");
		input.close();
		
	}

}