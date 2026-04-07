package April_6;

public class ChocolateProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //125
		int choco =n;
		while(n>2) {
			choco=choco+ n/3;
			n = n/3+ n%3;
		}
		System.out.println(choco);

	}

}
