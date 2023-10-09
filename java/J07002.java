import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static boolean Check(String s) {
		int n = s.length();
		if(n > 9) return false;
		for(int i=0; i<n; i++)
			if(s.charAt(i) < '0' || s.charAt(i) > '9')
				return false;
		return true;
	}
    public static void main(String[] args) throws FileNotFoundException {
        File fileRead = new File("DATA.in");
        Scanner reader = new Scanner(fileRead);
        long sum = 0L;
        while(reader.hasNext()){
            String data = reader.next();
            if(Check(data)) sum += Integer.parseInt(data);
        }
        System.out.println(sum);
        reader.close();
    }
}