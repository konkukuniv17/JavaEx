package 자바문법1주정복;

public class Ch04_01 {

	
	
	public static void main(String[] args) {
		Song mySong = new Song("nessun dorma");
		Song yourSong = new Song("공주는 잠 못 이루고");
		System.out.println("내 노래는" +mySong.getTitle());
		System.out.println("너의 노래는" +yourSong.getTitle());
		
	}

}
