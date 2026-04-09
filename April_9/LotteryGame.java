package April_9;
import java.util.*;
public class LotteryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n >= 300 && n <= 460) {
			System.out.println("The prize is MacBook.");
		}else if(n >= 200 && n <= 280) {
			System.out.println(" the prize is Kurkure.");
		}else if(n >= 1100 && n <= 1500) {
			System.out.println("the prize is Cycle.");
		}else if(n > 50 && n <= 80) {
			System.out.println("the prize is Bike.");
		}else {
			System.out.println("Better luck next Time");
		}

	}

}
