import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            String data = read.nextLine();
            System.out.println(data);
        }
        read.close();
    }
}
