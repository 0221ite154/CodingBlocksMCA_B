package April_7;
import java.util.Scanner;
public class MaximumOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater");
		}else if(b>a && b>c) {
			System.out.println("b is greater");
		}else if(c>a && c>b) {
			System.out.println("c is greater");
		}else {
			System.out.println("All are equal");
		}
	}

}
