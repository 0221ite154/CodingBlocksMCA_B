package April_7;

import java.util.Scanner;

public class GradepROBLEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("A");
		}else if(marks >=80 && marks<=89) {
			System.out.println("B");
		}else if(marks>=70 && marks<=79) {
			System.out.println("C");
		}else if(marks>=60 && marks<=69) {
			System.out.println("C");
		}else if(marks>=50 && marks<=59) {
			System.out.println("C");
		}else if(marks>=40 && marks<=49) {
			System.out.println("C");
		}else {
			System.out.println("fail");
		}
	}

}
