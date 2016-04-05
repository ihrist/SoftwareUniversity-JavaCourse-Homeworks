import java.io.*;



import java.io.*;

import java.nio.Buffer;

public class CountCharacterTypes {
    private static final String FILE_INPUT = "sample.txt";
    private static final String FILE_OUTPUT = "count-chars.txt";

    public static void main(String[] args)throws IOException {

        BufferedReader input = new BufferedReader(new FileReader(FILE_INPUT));
        BufferedWriter output = new BufferedWriter(new FileWriter(FILE_OUTPUT));

        String line;
        while ((line = input.readLine()) != null){
            String sentence = line;
            String vowels = "aeiouAEIOU";
            String punctuation = "`~!@#$%^&*()_+{}|:\"<>?-=[]\\;\\'.\\/,";
            int vowelCount = 0;
            int consonantCount = 0;
            int punctuationCount = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char currentChar = sentence.charAt(i);
                if(vowels.indexOf(currentChar) >= 0){
                    vowelCount++;
                }
                else if (punctuation.indexOf(currentChar)>= 0){
                    punctuationCount++;
                }
                else if(Character.isLetter(currentChar)){
                    consonantCount++;
                }
            }
            String outputFormat = String.format("Vowels: %d \r\n", vowelCount);
            String outputFormat1 = String.format("Consonants: %d \r\n", consonantCount);
            String outputFormat2 = String.format("Punctuation: %d \r\n", punctuationCount);

            output.write(outputFormat);
            output.write(outputFormat1);
            output.write(outputFormat2);
        }
        input.close();
        output.close();
    }
}
