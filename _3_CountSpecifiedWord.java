package regApisHomeWork;
import java.util.Scanner;

public class _3_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\W]+");
        String word = scanner.nextLine();
        int wordOccurrencesInTheInput = 0;
        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            if (word.toLowerCase().equals(s.toLowerCase())) {
                wordOccurrencesInTheInput++;
            }
        }
        System.out.println(wordOccurrencesInTheInput);
    }
}
