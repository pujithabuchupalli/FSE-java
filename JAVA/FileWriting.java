import java.io.*;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text to write to file:");
        if (sc.hasNextLine()) {            // check if input exists
            String text = sc.nextLine();
            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();
            System.out.println("Written to file");
        } else {
            System.out.println("No input provided.");
        }
        sc.close();
    }
}
