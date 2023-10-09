import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Mhang implements Comparable<Mhang>{
    String ma, ten, nhom;
    int mua, ban;
    public Mhang(String ma, String ten, String nhom, int mua, int ban){
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public int compareTo(Mhang a){
        if((this.ban - this.mua) < (a.ban-a.mua)) return 1;
        else{
            if((this.ban - this.mua) > (a.ban-a.mua)) return -1;
            else{
                if(this.ma.compareTo(a.ma) > 0) return 1;
                else if(this.ma.compareTo(a.ma) < 0) return -1;
            } 
        }
        return 0;
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mhang> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();  
        int cnt = 0;
        while(n-- > 0){
            String s = "MH";
            cnt++;
            String tmp = Integer.toString(cnt);
            while(tmp.length() < 3) tmp = "0" + tmp;
            s = s + tmp;
            list.add(new Mhang(s,sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for (Mhang mhang : list) {
            System.out.println(mhang.ma + " " + mhang.ten + " " + mhang.nhom + " " + mhang.mua + " " + mhang.ban + " " + (mhang.ban - mhang.mua));
        }
        sc.close();
    }
}
