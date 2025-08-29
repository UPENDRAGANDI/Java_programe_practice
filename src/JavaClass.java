
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class JavaClass {

    int id;
    String name;

    JavaClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        JavaClass obj = new JavaClass(1, "Example");
        System.out.println("ID: " + obj.id + ", Name: " + obj.name);


        try{
            FileOutputStream targetFile = new FileOutputStream("C:\\Users\\upend\\OneDrive\\Documents\\targetfile.txt");
            int id1 = obj.id;
            targetFile.write(id1);
            String na=obj.name;
            targetFile.write(na.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
