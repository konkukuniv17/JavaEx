package 자바문법1주정복;
import java.util.Scanner;

public class ch02_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String coffee;
		float num;
		System.out.print("커피 주문하세요>>");
		coffee = input.next();
		num = input.nextFloat();
		//System.out.print(coffee + num);
		if(coffee.equals("에스프레소"))
		{
			if(num>=10)
			{
				num = 2000*num; // 넘버가 갯수에서 가격으로 의미가 바뀜.
				System.out.print("\n"+0.95*num+"원 입니다.");
			}
		}
		if(coffee.equals("아메리카노"))
		{
			if(num>=10)
			{
				num = 2500*num; // 넘버가 갯수에서 가격으로 의미가 바뀜.
				System.out.print("\n"+0.95*num+"원 입니다.");
			}
		}
		if(coffee.equals("카푸치노"))
		{
			if(num>=10)
			{
				num = 3000*num; // 넘버가 갯수에서 가격으로 의미가 바뀜.
				System.out.print("\n"+0.95*num+"원 입니다.");
			}
		}
		if(coffee.equals("카페라떼"))
		{
			if(num>=10)
			{
				num = 3500*num; // 넘버가 갯수에서 가격으로 의미가 바뀜.
				System.out.print("\n"+0.95*num+"원 입니다.");
			}
		}
		input.close();
	}

}
