
import java.io.*;
import java.util.ArrayList;

public class SaveAnArrayListOfDubles {

        private static final String FILE_OUTPUT = "doubles.list";

    public static void main(String[] args)throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_OUTPUT));

        ArrayList  fileInput = new ArrayList();
        fileInput.add("S");
        fileInput.add("o");
        fileInput.add("f");
        fileInput.add("t");
        fileInput.add("u");
        fileInput.add("n");
        fileInput.add("i");
        output.writeObject(fileInput);

        FileInputStream file = new FileInputStream("doubles.list");
        ObjectInputStream input = new ObjectInputStream(file);
        file.read();
        input.close();
        output.close();
    }
}
