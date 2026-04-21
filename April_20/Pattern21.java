package April_20;
/*

n=5
*        *  2*(n-i)
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
        

 */
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//bottom
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
