package ch04_openchallenge;
import java.util.*;
public class WordGameApp {
	
	private Scanner scanner; // 키보드 입력
	private String startWord = "아버지"; // 시작 단어
	private Player[] players; // 게임 참가자들
	
	public WordGameApp() {
		scanner = new Scanner(System.in);	
	}

	// 게임 참가자 수를 입력받고 Player []을 생성하는 메소드
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int nPlayers = scanner.nextInt();
		players = new Player[nPlayers]; // Player [] 레퍼런스 배열 생성
		
		// 각 참여자의 이름을 입력받아 Player 객체 생성
		for(int i=0; i<nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			players[i] = new Player(name);
		}		
	}
	
	// 게임을 진행하는 메소드
	public void run() {
		createPlayers(); // 참가자를 위한 Player []을 생성한다.
		String lastWord = startWord; // startWord에서 부터 시작한다.

		System.out.println("시작하는 단어는 "+lastWord+ "입니다");
		int next =  0; // 참가자들의 순서대로 증가
		
		// 게임이 끝날 때까지 루프
		while(true) {
			String newWord = players[next].sayWord(); // next 참가자가 단어를 말하도록 한다.
			if(!players[next].succeed(lastWord)) { // next 참가자가 성공하였는지 검사.
				System.out.print(players[next].getName() + "이 졌습니다.");
				break; // 게임을 종료한다.
			}
			next++; // 다음 참가자
			next %= players.length; // next가 참가자의 개수보다 많게 증가하는 것을 막는다.
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
	}

}
