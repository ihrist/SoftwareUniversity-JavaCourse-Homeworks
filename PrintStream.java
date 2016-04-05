import java.io.*;
public class PrintStream {
	


	public static void main(String[] args) {
		String fileName = "sample.txt";
		try {
			@SuppressWarnings("resource")
			PrintWriter outputStream = new PrintWriter(fileName);
			outputStream.println("Hellow!");
			outputStream.close();
			System.out.println("Done");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			
		}
}

	


