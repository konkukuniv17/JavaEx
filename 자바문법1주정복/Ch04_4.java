package 자바문법1주정복;
import java.util.*;
public class Ch04_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("인원수 >> ");
		int num = input.nextInt();
		int i;
		String name = null ,tel = null;
		phone []v = new phone[num]; 
		
		//Ch04_4 phone = new Ch04_4();
		
		for(i=0;i<num;i++)	
		{
			System.out.println("이름과 전화번호>> ");
			name = input.next();
			tel = input.next();
			v[i] = new phone(name,tel);
		}
		
		while(true) 
		{
			System.out.println("검색할 이름 >> ");
			name = input.next();
			
			if(name.equals("exit"))
			{
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
			for(i=0;i<num;i++)
			{
				if(name.equals(v[i].getName()))
				{
					tel = v[i].getTel();
					System.out.println(name+"의 전화번호는 " + tel+ " 입니다.");
					break; // for문 탈출
				}
			}
			if(i==num)
				System.out.println(name +"이(가) 없습니다.");
		}
		input.close();
		
	}

}
