import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortArrayWithStream02 {

	public static void main(String[] args) {
		Scanner start = new Scanner(System.in);
        String[] input = start.nextLine().split("\\s+");
        List<Integer> inputList = new ArrayList<>();
        String command = start.nextLine();
 
        for (int i = 0; i < input.length; i++) {
            inputList.add(Integer.parseInt(input[i]));
        }
 
        if (command.equals("Ascending")) {
            Stream<Integer> numbers = inputList.stream().sorted(Comparator.naturalOrder());
            numbers.forEach(e -> System.out.print(e + " "));
        } else {
            Stream<Integer> numbers = inputList.stream().sorted(Comparator.reverseOrder());
            numbers.forEach(e -> System.out.print(e + " "));
        }

	}

}
