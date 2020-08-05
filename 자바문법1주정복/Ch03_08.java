package 자바문법1주정복;
import java.util.*;
public class Ch03_08 {
	
	static int n;
	
	static void draw(String user , String []str){
		System.out.print("사용자 ="+ user + " 컴퓨터 " +str[n]+ " 비겼습니다.");
	}
	
	static void win(String user, String []str){
		System.out.print("사용자 ="+ user + " 컴퓨터 " +str[n]+ " 사용자가 이겼습니다");
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user;
		String str[] = { "가위", "바위", "보 "}; // 0 1 2 
		//int n = (int)(Math.random()*3);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.println("가위 바위 보 ! >> ");
		
		while(true)
		{
			n = (int)(Math.random()*3);
			user = input.next();
			
			if(user.equals("그만"))
				break;
			
			if(str[n].equals("가위") && user.equals("가위"))
			{
				draw(user , str);
				continue;
			}
			if(str[n].equals("바위") && user.equals("바위"))
			{
				draw(user, str);
				continue;
			}
			if(str[n].equals("보") && user.equals("보"))
			{
				draw(user, str);
				continue;
			}
			
			if(user.equals("가위") && n == 2)
			{
				win(user,str);
			}
			else if(user.equals("바위") && n == 0)
			{
				win(user,str);
			}
			else if(user.equals("보") && n == 1)
			{
				win(user,str);
			}
			else
			{
				System.out.println("사용자 ="+ user + "컴퓨터 " +str[n]+ "컴퓨터가 이겼습니다");
			}
		}
		System.out.println("게임을 종료합니다...");
		input.close();
	}

}
