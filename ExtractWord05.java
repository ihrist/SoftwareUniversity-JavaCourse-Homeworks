package regApisHomeWork;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWord05 {
    public static void main(String[] args) {
        System.out.println("Enter your line: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern regex = Pattern.compile("[a-zA-Z]+");
        Matcher match = regex.matcher(line);

        while (match.find()){
            System.out.print(match.group(0) + " ");
        }
    }
}
