import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class J07085 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("DATA.in");
        DataInputStream reader = new DataInputStream(file);
        while(reader.available() > 0){
            String data = reader.toString();
            String tmp = "";
            for(int i = 0; i < data.length(); i++){
                if(Character.isDigit(data.charAt(i))){
                    tmp += data.charAt(i);
                }
            }
            long sum = 0;
            String ans = "";
            for(int i = 0; i < tmp.length(); i++){
                sum += (tmp.charAt(i) - '0');
                if(sum > 0) ans += tmp.charAt(i);
            }
            System.out.println(ans + " " + sum); 
        }
        reader.close();
    }
}
