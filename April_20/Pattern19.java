package April_20;
/*
 n=4
   *
  ***
 *****
*******
 */

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
