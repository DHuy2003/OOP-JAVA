import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class J07021 {
    public static Vector<String> v = new Vector<>();
    public static void Xuli(String s){
        char c = s.charAt(0);
        c = Character.toUpperCase(c);
        String tmp = "";
        for(int i = 1; i < s.length(); i++){
            tmp += s.charAt(i);
        }
        tmp = c + tmp;
        System.out.print(tmp + " ");
    }
   public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner read = new Scanner(file);
        while(read.hasNextLine()){
            String data = read.nextLine();
            data = data.trim();
            if(data.equals("END")) break;
            data = data.toLowerCase();
            int i = 0;
            while(i < data.length()){
                if(data.charAt(i) == ' '){
                    String tmp = data.substring(0, i);
                    Xuli(tmp);
                    data = data.substring(i);
                    data = data.trim();
                    i = 0;
                }
                i++;
            }
            Xuli(data);
            System.out.println();
        }
        read.close();
    }
}
