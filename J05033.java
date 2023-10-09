import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int g,p,s;
    public Time(int g, int p, int s){
        this.g = g;
        this.p = p;
        this.s = s;
    }
    public int compareTo(Time a){
        if(this.g != a.g){
            if(this.g > a.g) return 1;
        }
        else{
            if(this.p != a.p){
                if(this.p > a.p) return 1;
            }
            else{
                if(this.s != a.s){
                    if(this.s > a.s) return 1;
                }
            }
        }
        return -1;
    }
}

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new Time(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(list);
        for (Time time : list) {
            System.out.println(time.g + " " + time.p + " " + time.s);
        }
        sc.close();
    }
}
