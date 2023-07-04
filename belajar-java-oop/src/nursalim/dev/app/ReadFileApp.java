package nursalim.dev.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {
    public static void main(String[] args) {
        readFileTryWithResource();
    }

    public static void readFile() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("README.md"));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error reading file: " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("File closed");
                } catch (IOException e) {
                    System.out.println("Error close resource: " + e.getMessage());
                }
            }
        }
    }

    public static void readFileTryWithResource() {
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
}
