package regApisHomeWork;
import java.util.Scanner;

public class _4_CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\W]+");
        System.out.println(input.length);
    }
}
