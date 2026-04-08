package April_8;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul = mul *i;
		}
		System.out.println(mul);
 
	}

}
