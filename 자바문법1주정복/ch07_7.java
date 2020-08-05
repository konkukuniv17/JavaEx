package 자바문법1주정복;
import java.util.*;

class Location {
	private int x, y;
	public Location(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public double distance(Location b) {
		double d = (x - b.x)*(x - b.x) + (y - b.y)*(y - b.y);
		return Math.sqrt(d);
	}
}


public class ch07_7 {

	public static void main(String[] args) {
		ArrayList<Location> travel = new ArrayList<Location>();
		Scanner scanner = new Scanner(System.in);
		
		travel.add(new Location(0,0)); // 시작 위치
		System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
		for (int i=0; i<5; i++) {
			System.out.print(">> ");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			travel.add(new Location(x, y));
		}
		travel.add(new Location(0,0)); // 최종 위치
		
		double sum = 0.0;
		for(int i=0; i<travel.size()-1; i++) {
			// Location(i)와 Location(i+1)의사이의 이동 거리
			double d = travel.get(i).distance(travel.get(i+1));
			sum += d;	
		}
		System.out.println("총 이동 거리는 " + sum);	
		scanner.close();
	}

}
