import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    
        public static void main(String[] args) throws FileNotFoundException {
            File fileRead = new File("DATA.in");
            Scanner reader = new Scanner(fileRead);
            String s = reader.next();
            while(s.length() > 1){
                BigInteger a = new BigInteger(s.substring(0, s.length()/2));
                BigInteger b = new BigInteger(s.substring(s.length()/2));
                BigInteger c = a.add(b);
                System.out.println(c);
                s = c.toString();
            }
            reader.close();
        }
}
