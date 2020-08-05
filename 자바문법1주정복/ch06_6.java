package 자바문법1주정복;
import java.util.*;

class gameRun {
	
	int a,b;
	
	public gameRun(int a , int b)
	{
		this.a =a; this.b =b;
	}
	
	public void result()
	{
		if(this.a == this.b)
		{
			System.out.println("비겼습니다.");
		}
		else if(this.a == 0 && this.b == 1)
		{
				System.out.println(" 컴퓨터가 이겼습니다.");
		}
		else if(this.a == 1 && this.b == 2)
		{
				System.out.println(" 컴퓨터가 이겼습니다.");
		}
		else if(this.a == 2 && this.b == 0)
		{
				System.out.println(" 컴퓨터가 이겼습니다.");
		}
		else
		{
			System.out.println(" 사용자가 이겼습니다. ");
		}
	
	}
}



public class ch06_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String arr[] = { "가위", "바위", "보 "}; 
		int num;
		int comp;
		
		//gameRun gr = new gameRun(2,5);
		
		while(true)
		{
			System.out.print("가위(1) 바위(2) 보(3) 끝내기(4) >> ");
			num = input.nextInt();
			if(num == 4)
				break;
			num--;
			
			
			comp = random.nextInt(3);
			
			System.out.println("사용자 " + arr[num] + " : 컴퓨터 " + arr[comp]);
			gameRun gr = new gameRun(num,comp);
			gr.result();
		}
		System.out.println("게임을 종료합니다...");
		input.close();
	}
	
}
