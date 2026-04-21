package April_20;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		/*
		 n=4
		 
		 *******
		  *****
		   ***
		    *
		 */
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
