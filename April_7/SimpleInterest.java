package April_7;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int roi = sc.nextInt();
		int time = sc.nextInt();
		
		int IA = p * roi /100;
		
		int payable = p + IA*time;
		
		System.out.println(payable);
	}

}
