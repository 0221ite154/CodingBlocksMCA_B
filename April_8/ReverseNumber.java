package April_8;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n>0) {
			sum=sum*10+n%10;
			n=n/10;
		}
		System.out.println(sum);

	}

}
