package �ڹٹ���1������;
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
			System.out.println("�����ϴ�.");
		}
		else if(this.a == 0 && this.b == 1)
		{
				System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if(this.a == 1 && this.b == 2)
		{
				System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
		}
		else if(this.a == 2 && this.b == 0)
		{
				System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
		}
		else
		{
			System.out.println(" ����ڰ� �̰���ϴ�. ");
		}
	
	}
}



public class ch06_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String arr[] = { "����", "����", "�� "}; 
		int num;
		int comp;
		
		//gameRun gr = new gameRun(2,5);
		
		while(true)
		{
			System.out.print("����(1) ����(2) ��(3) ������(4) >> ");
			num = input.nextInt();
			if(num == 4)
				break;
			num--;
			
			
			comp = random.nextInt(3);
			
			System.out.println("����� " + arr[num] + " : ��ǻ�� " + arr[comp]);
			gameRun gr = new gameRun(num,comp);
			gr.result();
		}
		System.out.println("������ �����մϴ�...");
		input.close();
	}
	
}
