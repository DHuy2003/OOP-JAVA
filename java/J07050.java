import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Mhang implements Comparable<Mhang>{
    String ma, ten, nhom;
    double mua, ban;
    public Mhang(String ma, String ten, String nhom, double mua, double ban){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public int compareTo(Mhang a){
        if((this.ban - this.mua) < (a.ban-a.mua)) return 1;
        else if((this.ban - this.mua) > (a.ban-a.mua)) return -1;
        return 0;
    }
}

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MATHANG.in");
        Scanner read = new Scanner(file);
        List<Mhang> list = new ArrayList<>();
        int n = Integer.parseInt(read.nextLine());
        int cnt = 0;
        while(n-- > 0){
            String s = "MH";
            cnt++;
            if(cnt < 10) s = s + "0" + Integer.toString(cnt);
            else s = s + Integer.toString(cnt);
            list.add(new Mhang(s,read.nextLine(), read.nextLine(),  Double.parseDouble(read.nextLine()), Double.parseDouble(read.nextLine())));
        }
        Collections.sort(list);
        for (Mhang mhang : list) {
            System.out.print(mhang.ma + " " + mhang.ten + " " + mhang.nhom + " ");
            System.out.printf("%.2f",(mhang.ban-mhang.mua));
            System.out.println();
        }
        read.close();
    }
}
