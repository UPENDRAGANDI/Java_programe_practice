import java.io.*;

public class FilesDemo {

    public static void main(String[] args) throws IOException {
        // 1. BufferedReader and BufferedWriter (line by line)
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\users\\upend\\OneDrive\\Documents\\topics.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\upend\\OneDrive\\Documents\\targetfile_buffered.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                System.out.println(line); // Print each line to console
            }
        }



//        // Use try-with-resources for automatic resource management
//        try (FileInputStream sourceStream = new FileInputStream("C:\\users\\upend\\OneDrive\\Documents\\topics.txt");
//             FileOutputStream targetStream = new FileOutputStream("C:\\Users\\upend\\OneDrive\\Documents\\targetfile.txt")) {
//            // Reading source file and writing content to target file byte by byte
//            int temp;
//            while ((temp = sourceStream.read()) != -1) {
//                targetStream.write((byte) temp);
//                System.out.print((char) temp); // Print each character to console
//            }
//        }
    }
}
