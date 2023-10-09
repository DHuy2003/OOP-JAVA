import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException{
        File real = new File("Hello.txt");
        Scanner read = new Scanner(real);
        while(read.hasNextLine()){
            String data = read.nextLine();
            System.out.println(data);
        }
        read.close();
    }
}
