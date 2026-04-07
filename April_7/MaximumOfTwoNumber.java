package April_7;

import java.util.Scanner;

public class MaximumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println("a is greater");
		}else if(a==b) {
			System.out.println("both are equal");
		}else {
			System.out.println("b is greater");
			
		}

	}

}
