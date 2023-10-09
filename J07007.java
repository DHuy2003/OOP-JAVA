import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner read = new Scanner(file);
        Vector<String> v = new Vector<>();
        while(read.hasNext()){
            String data = read.next();
            if(!v.contains(data.toLowerCase())) v.add(data.toLowerCase());
        }
        Collections.sort(v);
        for (String string : v) {
            System.out.println(string);
        }
        read.close();
    }
}
