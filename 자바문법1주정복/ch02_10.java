package �ڹٹ���1������;
import java.util.Scanner;

public class ch02_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String coffee;
		float num;
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		coffee = input.next();
		num = input.nextFloat();
		//System.out.print(coffee + num);
		if(coffee.equals("����������"))
		{
			if(num>=10)
			{
				num = 2000*num; // �ѹ��� �������� �������� �ǹ̰� �ٲ�.
				System.out.print("\n"+0.95*num+"�� �Դϴ�.");
			}
		}
		if(coffee.equals("�Ƹ޸�ī��"))
		{
			if(num>=10)
			{
				num = 2500*num; // �ѹ��� �������� �������� �ǹ̰� �ٲ�.
				System.out.print("\n"+0.95*num+"�� �Դϴ�.");
			}
		}
		if(coffee.equals("īǪġ��"))
		{
			if(num>=10)
			{
				num = 3000*num; // �ѹ��� �������� �������� �ǹ̰� �ٲ�.
				System.out.print("\n"+0.95*num+"�� �Դϴ�.");
			}
		}
		if(coffee.equals("ī���"))
		{
			if(num>=10)
			{
				num = 3500*num; // �ѹ��� �������� �������� �ǹ̰� �ٲ�.
				System.out.print("\n"+0.95*num+"�� �Դϴ�.");
			}
		}
		input.close();
	}

}
