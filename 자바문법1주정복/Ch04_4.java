package �ڹٹ���1������;
import java.util.*;
public class Ch04_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�ο��� >> ");
		int num = input.nextInt();
		int i;
		String name = null ,tel = null;
		phone []v = new phone[num]; 
		
		//Ch04_4 phone = new Ch04_4();
		
		for(i=0;i<num;i++)	
		{
			System.out.println("�̸��� ��ȭ��ȣ>> ");
			name = input.next();
			tel = input.next();
			v[i] = new phone(name,tel);
		}
		
		while(true) 
		{
			System.out.println("�˻��� �̸� >> ");
			name = input.next();
			
			if(name.equals("exit"))
			{
				System.out.print("���α׷��� �����մϴ�.");
				break;
			}
			
			for(i=0;i<num;i++)
			{
				if(name.equals(v[i].getName()))
				{
					tel = v[i].getTel();
					System.out.println(name+"�� ��ȭ��ȣ�� " + tel+ " �Դϴ�.");
					break; // for�� Ż��
				}
			}
			if(i==num)
				System.out.println(name +"��(��) �����ϴ�.");
		}
		input.close();
		
	}

}
