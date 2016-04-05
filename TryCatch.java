import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		try {
			int i = Integer.parseInt(str);
			System.out.printf("You entered a valid integer number %d.", i);
		} catch (NumberFormatException nfex) {
			System.out.println("Invalid integer number: " + nfex);
		}

	}

}
