import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong> {
    String sign, name;
    int price; 
    double serve;
    public LoaiPhong(String tmpString){
        String[] temp = tmpString.trim().split("\\s+");
        this.sign = temp[0];
        this.name = temp[1];
        this.price = Integer.parseInt(temp[2]);
        this.serve = Double.parseDouble(temp[3]);
    }
    public int compareTo(LoaiPhong a){
        if(this.name.compareTo(a.name) > 0) return 1;
        else return -1;
    }
    @Override
    public String toString() {
        return sign + " " + name + " " + price + " " + serve;
    }
}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("input.txt"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
