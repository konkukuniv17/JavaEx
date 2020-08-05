package 자바문법1주정복;
import java.util.*;
public class ch06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String v;
		int count = 0;
		while(true)
		{
			v = input.nextLine();
			if(v.equals("exit"))
				break;
			
			StringTokenizer st = new StringTokenizer(v," ");
			while(st.hasMoreTokens())
			{
				st.nextToken();
				count++;
			}
			System.out.println("어절 갯수는 >>"+ count);
			count=0;
		}
		
		input.close();
	}

}
