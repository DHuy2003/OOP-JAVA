import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Bdiem{
    private static final String HIDDEN_STRING = "SV";
    private static int hiddenNumber = 0;
    private String id,name;
    private double ob1, ob2, ob3;
    private int rank;
    public Bdiem(String name, double ob1, double ob2, double ob3){
        this.id = makeId();
        this.name = Xuli(name);
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }
    public String getId() {
        return id;
    }
    private String makeId() {
        hiddenNumber++;
        return hiddenNumber < 10 ? HIDDEN_STRING + "0" + hiddenNumber : HIDDEN_STRING + hiddenNumber;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRank() {
        return rank;
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
        double p = (this.ob1 * 3 + this.ob2 * 3 + this.ob3 * 2) / 8;
        return p;
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f %d", id, name, getPoint(), rank);
    }
}

public class J07054{
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("BANGDIEM.in");
        Scanner sc = new Scanner(f);
        List<Bdiem> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            l.add(new Bdiem(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        sort(l);
        l.get(0).setRank(1);
        for(int i = 1; i < l.size(); i++){
            if(l.get(i).getPoint() == l.get(i-1).getPoint()) l.get(i).setRank(l.get(i-1).getRank());
            else l.get(i).setRank(i+1);
        }
        for (Bdiem bdiem : l) {
            System.out.println(bdiem);
        }
        sc.close();
    }
    private static void sort(List<Bdiem> l) {
        Collections.sort(l, new Comparator<Bdiem>() {
            @Override
            public int compare(Bdiem o1, Bdiem o2) {
                int result = Double.compare(o1.getPoint(), o2.getPoint());
                if(result == 0) return o1.getId().compareTo(o2.getId());
                else if (o1.getPoint() < o2.getPoint()) return 1;
                else return -1;
            }
            
        });
    }
}