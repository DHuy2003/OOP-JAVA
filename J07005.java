import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class J07005 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("DATA.IN");
        DataInputStream reader = new DataInputStream(file);
        TreeMap<Integer,Integer> mp = new TreeMap<>();
	    while(reader.available() > 0){
            int n = reader.readInt();
            if(mp.containsKey(n)) mp.replace(n,mp.get(n)+1);
            else mp.put(n, 1);
        }
        mp.forEach((K,V) ->{
            System.out.println(K + " " + V);
        });
        reader.close();
	}
}
