package regApisHomeWork;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_CountSubstringOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = scanner.next();

        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        int start = 0;
        while (matcher.find(start)) {
            count++;
            start = matcher.start() + 1;
        }
        System.out.println(count);
    }
}
