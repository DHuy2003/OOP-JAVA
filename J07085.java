import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class J07085 {
    public static String Zero(String s){
        int i = 0;
        while(i < s.length() && s.charAt(i) =='0') i++;
        s =s.substring(i);
        return s;
    }
    public static long Sum(String s){
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) - '0');
        }
        return sum;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream read = new ObjectInputStream(file);
        @SuppressWarnings("unchecked")
        ArrayList<String> list = (ArrayList<String>) read.readObject();
        for(String s : list){
            String tmp = "";
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    tmp += (s.charAt(i) + "");
                }
            }
            System.out.println(Zero(tmp) + " " + Sum(tmp));
        }
        read.close();
    }
}
