package 자바문법1주정복;
import java.util.*;
public class ch07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		Iterator<Integer> it = v.iterator();
		
		int a;
		for(int i = 0 ; i < 5; i++)
		{
			a = input.nextInt();
			v.add(a);
		}
		int n = Integer.MIN_VALUE;
		int n2;
		
		for(int i=0; i<v.size(); i++) {
			if(n < v.get(i)) 
				n = v.get(i);
		}
		System.out.println(n);
		
		input.close();
		
	}

}
