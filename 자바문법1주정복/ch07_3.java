package 자바문법1주정복;
import java.util.*;
public class ch07_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		
		Scanner input = new Scanner(System.in);
		
		h.put("아메리카노", 2000);
		h.put("카푸치노", 3000);
		
		while(true)
		{
		String v = input.next(); 
		if(v.equals("그만"))
			break;
		
		System.out.println( v + "는 " + h.get(v) + " 입니다.");
		}
		System.out.println("종료합니다...");
		
		input.close();
	}

}
