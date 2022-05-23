
public class FibnocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, f1 = 0, f2 = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	     System.out.print(f1 + ", ");

	      // compute the next term
	      int f3 = f1 + f2;
	      f1 = f2;
	      f2 = f3;
	    }

	}

}
