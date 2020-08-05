package 자바문법1주정복;
import java.util.*;
//import java.io.*;
public class Ch04_02 {

	public static void main(String[] args) {
		//phone u [] = new phone[2];
		//phone s = new phone("13","13");
		Scanner input = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name,tel;
		name = input.next();
		tel = input.next();
		phone u = new phone(name,tel);
		
		name = input.next();
		tel = input.next();
		phone v = new phone(name,tel); 
		
		System.out.println(u.getName()+"의 전화번호 >> "+u.getTel());
		System.out.println(v.getName()+"의 전화번호 >> "+v.getTel());
		input.close();
	}

}

class phone{
	private String name,tel;
	public phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}