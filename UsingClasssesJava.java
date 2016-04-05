import java.time.LocalDate;
import java.util.Random;

public class UsingClasssesJava {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		Random rnd = new Random();
		int randomNumber = 1 + rnd.nextInt(100);
		System.out.println(randomNumber + " " + randomNumber);

	}

}
