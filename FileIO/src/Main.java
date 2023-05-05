import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Manish.txt");

        //to create a new file
        file.createNewFile();

        //to write in file

        FileWriter writer = new FileWriter("Manish.txt");
        writer.write("Hey there its ManIsh DhuNgaNa.");
        writer.close();


        FileReader reader = new FileReader("Manish.txt");
        int value;
        while ((value = reader.read()) != -1) {

            System.out.print((char) value);
        }
        reader.close();

         file.delete();


    }
}
