import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AllCapitals {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new FileReader("sample.txt"));
		
		String line;
		String finest = "";
		while ((line = input.readLine()) !=null){
			finest += line.toUpperCase()+"\n";
		}
		String outputFormat = String.format("%s", finest);
		
		FileWriter writer = new FileWriter("sample.txt");
		PrintWriter printWriter = new PrintWriter(writer);
        printWriter.write(outputFormat);
        input.close();
        printWriter.close();
		
	}

}
