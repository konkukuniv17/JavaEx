package �ڹٹ���1������;
import java.util.*;
public class ch06_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String v;
		v= input.nextLine();
		StringTokenizer st = new StringTokenizer(v,"+ ");
		int num=0;
		while(st.hasMoreTokens())
		{
			String token = st.nextToken();
			token.trim();
			num += Integer.parseInt(token);
		}
		System.out.println("���� " + num);
		
		input.close();
	}

}
