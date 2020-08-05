package ch06_openchallenge;
import java.util.*;
public class histogram {

	
	static String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			String line = scanner.nextLine();
			if(line.equals(";"))
				break;
			sb.append(line);
		}
		
		return sb.toString(); 
	}
	
	static int chkword (String c){
		c = c.toLowerCase();
		
		if(c.equals("a"))
			return 1;
		else if(c.equals("b"))
			return 2;
		else if(c.equals("c"))
			return 3;
		else if(c.equals("d"))
			return 4;
		else if(c.equals("e"))
			return 5;
		else if(c.equals("f"))
			return 6;
		else if(c.equals("g"))
			return 7;
		else if(c.equals("h"))
			return 8;
		else if(c.equals("i"))
			return 9;
		else if(c.equals("j"))
			return 10;
		else if(c.equals("k"))
			return 11;
		else if(c.equals("l"))
			return 12;
		else if(c.equals("m"))
			return 13;
		else if(c.equals("n"))
			return 14;
		else if(c.equals("o"))
			return 15;
		else if(c.equals("p"))
			return 16;
		else if(c.equals("q"))
			return 17;
		else if(c.equals("r"))
			return 18;
		else if(c.equals("s"))
			return 19;
		else if(c.equals("t"))
			return 20;
		else if(c.equals("u"))
			return 21;
		else if(c.equals("v"))
			return 22;
		else if(c.equals("w"))
			return 23;
		else if(c.equals("x"))
			return 24;
		else if(c.equals("y"))
			return 25;
		else if(c.equals("z"))
			return 26;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v = readString();
		String temp;
		char tempword;
		int [] arr = new int[27];
		int ascii = 65;
		int index=0;
		
		while(index<v.length()) {
			
			System.out.println(v.charAt(index));
			tempword = v.charAt(index);
			temp = Character.toString(tempword);
			
			arr[chkword(temp)]++;
			index++;
		}
	
		
		System.out.println(arr[0]);
		for( int i = 1 ; i < arr.length; i++)
		{
			System.out.print((char)ascii + "(" + arr[i] + ")   ");
			for ( int k = 0 ; k <arr[i]; k++)
			{
				System.out.print("-");
			}
			System.out.println();
			ascii++;
		}		
	}

}
