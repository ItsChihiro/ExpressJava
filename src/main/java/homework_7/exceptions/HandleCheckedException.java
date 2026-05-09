package homework_7.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleCheckedException {
    public static void readFile() {
        try {
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static void main(String[] args) {
        readFile();
    }
}
