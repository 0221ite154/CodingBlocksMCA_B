package April_9;

public class Pattern9 {
	/*
	 *    n=4
	 *    ****   //star = 4 , i=1   //n-i+1
	 *    ***    //star=3, i=2   //n-i+1
	 *    **     //star=2,i=3   ////n-i+1
	 *    *      //star=1,i=4  //n-i+1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i+1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		

	}

}
