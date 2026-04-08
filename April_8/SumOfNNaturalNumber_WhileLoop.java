package April_8;
import java.util.*;
public class SumOfNNaturalNumber_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
			
		}
		System.out.println(sum);

	}

}
