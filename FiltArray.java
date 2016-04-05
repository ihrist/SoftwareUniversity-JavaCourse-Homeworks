import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltArray {

	public static void main(String[] args) {
		
		        Scanner input = new Scanner(System.in);
		        List<String> listArray = 
		        		Arrays.asList(input.nextLine().split("\\W+")).stream().filter(a -> a.length() > 3).
		        		collect(Collectors.toList());
		        if (listArray.isEmpty()) {
		            System.out.print("(empty)");
		        } else {
		            listArray.forEach(e -> System.out.print(e + " "));
		        }
		    }
		

	}


