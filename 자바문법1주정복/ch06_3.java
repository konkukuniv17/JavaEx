package 자바문법1주정복;

import java.util.Random;

public class ch06_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c=0;
		Random random = new Random();
		
		while(true)
		{
			a= random.nextInt(3)+1;
			b= random.nextInt(3)+1;
			c= random.nextInt(3)+1;
			System.out.println(a+"   "+b+"   "+c+"   ");
			if(a==b)
			{
				if(b==c)
				{
					System.out.println("성공");
					break;
			
				}
			}
		}
	}

}
