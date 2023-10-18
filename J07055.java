import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Diem{
    private String id, name, rank;
    private double practice, online, exam;
    private static final String HIDDEN_STRING = "SV";
    private static int hiddenNumber = 0;
    public Diem(String name, double practice, double online, double exam){
        this.id = makeId();
        this.name = Xuli(name);
        this.practice = practice;
        this.online = online;
        this.exam = exam;
        this.rank = makeRank();
    }
    
    public String makeId(){
        hiddenNumber++;
        return hiddenNumber < 10 ? HIDDEN_STRING + "0" + hiddenNumber : HIDDEN_STRING + hiddenNumber;
    }
    public String Chuan(String s){
        String tmp = "";
        char c = s.charAt(0);
        c = Character.toUpperCase(c);
        tmp += c;
        for(int i = 1; i < s.length(); i++){
            tmp += s.charAt(i);
        }
        return tmp + " ";
    }
    public String Xuli(String s){
        String name = "";
        s = s.trim().toLowerCase();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' '){
                String tmp = s.substring(0, i);
                name += Chuan(tmp);
                s = s.substring(i);
                s = s.trim();
                i = 0;
            }
            i++;
        }
        name += Chuan(s);
        return name;
    }
    public double getPoint(){
        double p = this.practice * 0.25 + this.online * 0.35 + this.exam * 0.4;
        return p;
    }
    public String makeRank() {
        if(getPoint() >= 8) return "GIOI";
        else{
            if(getPoint() >= 6.5 && getPoint() < 8) return "KHA";
            else{
                if(getPoint() >= 5 && getPoint() < 6.5) return "TRUNG BINH";
                else return "KEM";
            }
        }
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f %s", id, name, getPoint(), rank);
    }
}
public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("input.txt");
        Scanner sc = new Scanner(f);
        List<Diem> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            l.add(new Diem(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        sort(l);
        for (Diem diem : l) {
            System.out.println(diem);
        }
        sc.close();
    }

    private static void sort(List<Diem> l) {
        Collections.sort(l, new Comparator<Diem>() {
            @Override
            public int compare(Diem o1, Diem o2) {
                if(o1.getPoint() < o2.getPoint()) return 1;
                else return -1;
            }
        });
    }
}
