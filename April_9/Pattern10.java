package April_9;

public class Pattern10 {
	/*
	 *  n=4
	 *  1234
	 *  123
	 *  12
	 *  1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i+1;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
		

	}

}


