package �ڹٹ���1������;
import java.util.Scanner;

public class ch2_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cash;
		int temp;
		System.out.print("���� �׼��� �Է��ϼ���>");
		cash = input.nextInt();
		
		if(cash >= 50000)
		{
			temp = cash / 50000;
			System.out.print("������"+temp+"��,");
			cash -= temp*50000;
		}
		else
			System.out.print("������  0��,");
		if(cash >= 10000)
		{
			temp = cash / 10000;
			System.out.print("����"+temp+"��,");
			cash -= temp*10000;
		}
		else
			System.out.print("����  0��,");
		if(cash >= 1000)
		{
			temp = cash / 1000;
			System.out.print("õ��"+temp+"��,");
			cash -= temp*1000;
		}
		else 
			System.out.print("õ��  0��,");
		if(cash >= 500)
		{
			temp = cash / 500;
			System.out.print("�����"+temp+"��,");
			cash -= temp*500;
		}
		else 
			System.out.print("�����  0��,");
		if(cash >= 100)
		{
			temp = cash / 100;
			System.out.print("���"+temp+"��,");
			cash -= temp*100;
		}
		else 
			System.out.print("���  0��,");
		if(cash >= 10)
		{
			temp = cash / 10;
			System.out.print("�ʿ�"+temp+"��,");
			cash -= temp*10;
		}
		else  
			System.out.print("�ʿ�  0��,");
		if(cash >= 1)
		{
			temp = cash / 1;
			System.out.print("�Ͽ�"+temp+"��");
			cash -= temp*1;
		}
		else  
			System.out.print("�Ͽ�  0��");
		input.close();
		
	}

}