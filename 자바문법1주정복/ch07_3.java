package �ڹٹ���1������;
import java.util.*;
public class ch07_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		
		Scanner input = new Scanner(System.in);
		
		h.put("�Ƹ޸�ī��", 2000);
		h.put("īǪġ��", 3000);
		
		while(true)
		{
		String v = input.next(); 
		if(v.equals("�׸�"))
			break;
		
		System.out.println( v + "�� " + h.get(v) + " �Դϴ�.");
		}
		System.out.println("�����մϴ�...");
		
		input.close();
	}

}
