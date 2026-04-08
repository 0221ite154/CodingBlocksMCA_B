package April_8;
import java.util.*;
public class Factorial_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int mul=1;
		int i=1;
		while(i<=n) {
			mul=mul*i;
			i++;
		}
		System.out.println(mul);
	}

}
