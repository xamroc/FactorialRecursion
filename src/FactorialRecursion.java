
public class FactorialRecursion {

	public static void main(String[] args) {

		int n = 5;
		
		/** Setup for user input at later iteration
		while(n<0) {
			System.out.println("Number should be positive!");
		}
		*/
		
		System.out.println(factorial(n));

	}

	public static int factorial(int n) {
		
		if(n==0) return 1;
		
		else if(n>=0) {
			return (n * factorial(n-1));
		}
		
		return 0;
	}
}
