import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		System.out.println("Enter Factorial Number = ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long factorial = calcFactorial(n);
		System.out.printf("%d! = %d", n, factorial);

	}

	private static long calcFactorial(int n) {
		if (n<=1){
			return 1;
		}
		return n* calcFactorial(n-1);
	}

}
