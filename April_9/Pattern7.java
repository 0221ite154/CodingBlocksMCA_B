package April_9;
/*
 * n=4
 *   4321
 *   4321
 *   4321
 *   4321
 */
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
