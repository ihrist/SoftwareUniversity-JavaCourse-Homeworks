package regApisHomeWork;
import java.util.Scanner;
import java.util.regex.*;

public class regexApi01 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
	        String input1 = input.nextLine();
	        Pattern pattern = Pattern.compile("(?<=\\s|^)([a-z0-9]+(?:[_.-][a-z0-9]+)*@[a-z]+\\-?[a-z]+(?:\\.[a-z]+)+)\\b");
	        Matcher matcher = pattern.matcher(input1);
	        while (matcher.find()) {
	            System.out.println(matcher.group());
		


	}

}
	}
