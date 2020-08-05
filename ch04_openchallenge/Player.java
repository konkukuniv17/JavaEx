package ch04_openchallenge;
import java.util.*;
public class Player {
	Scanner scanner; // Ű���� �Է�
	private String name; // ���� �������� �̸�
	private String word; // �����ڰ� ���� �ܾ�
	
	public Player(String name) {
		this.name = name;
		scanner = new Scanner(System.in);	
	}
	
	public String getName() {return name;}
	
	public String sayWord() {
		System.out.print(name+">>");
		word = scanner.next();
		return word;
	}
	
	// lastWord�� �����ڰ� ���� word�� ���Ͽ� �����ձⰡ �ߵǾ����� �Ǵ�.
	// �����Ͽ����� true ����
	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length()-1; // ���� �ܾ��� �� ������ ������ �ε���
		
		// ���� �ܾ��� �� ������ ���ڿ� �����ڰ� ���� �ܾ��� ù ���ڰ� ������ ��
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}
