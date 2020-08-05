package ch04_openchallenge;
import java.util.*;
public class Player {
	Scanner scanner; // 키보드 입력
	private String name; // 게임 참가자의 이름
	private String word; // 참가자가 말한 단어
	
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
	
	// lastWord와 참가자가 말한 word를 비교하여 끝말잇기가 잘되었는지 판단.
	// 성공하였으면 true 리턴
	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length()-1; // 최종 단어의 맨 마지막 문자의 인덱스
		
		// 최종 단어의 맨 마지막 문자와 참가자가 말한 단어의 첫 문자가 같은지 비교
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}
