package �ڹٹ���1������;
import java.util.*;
public class Ch03_08 {
	
	static int n;
	
	static void draw(String user , String []str){
		System.out.print("����� ="+ user + " ��ǻ�� " +str[n]+ " �����ϴ�.");
	}
	
	static void win(String user, String []str){
		System.out.print("����� ="+ user + " ��ǻ�� " +str[n]+ " ����ڰ� �̰���ϴ�");
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user;
		String str[] = { "����", "����", "�� "}; // 0 1 2 
		//int n = (int)(Math.random()*3);
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.println("���� ���� �� ! >> ");
		
		while(true)
		{
			n = (int)(Math.random()*3);
			user = input.next();
			
			if(user.equals("�׸�"))
				break;
			
			if(str[n].equals("����") && user.equals("����"))
			{
				draw(user , str);
				continue;
			}
			if(str[n].equals("����") && user.equals("����"))
			{
				draw(user, str);
				continue;
			}
			if(str[n].equals("��") && user.equals("��"))
			{
				draw(user, str);
				continue;
			}
			
			if(user.equals("����") && n == 2)
			{
				win(user,str);
			}
			else if(user.equals("����") && n == 0)
			{
				win(user,str);
			}
			else if(user.equals("��") && n == 1)
			{
				win(user,str);
			}
			else
			{
				System.out.println("����� ="+ user + "��ǻ�� " +str[n]+ "��ǻ�Ͱ� �̰���ϴ�");
			}
		}
		System.out.println("������ �����մϴ�...");
		input.close();
	}

}
