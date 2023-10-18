import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
 
class Xtuyen{
    private String id, name, born;
    private double theory, practice;
    public Xtuyen(String id, String name, String born, double theory, double practice){
      this.id = id;
      this.name = Xuli(name);
      this.born = ChuanHoa(born);
      this.theory = theory;
      this.practice = practice;
    } 
    public String ChuanHoa(String born){
        String[] tmp = born.trim().split("/");
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i].length() == 1) tmp[i] = "0" + tmp[i];
        }
        return tmp[0] + "/" + tmp[1] + "/" + tmp[2];
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
    public long Point(){
        if(this.theory >= 8 && this.practice >= 8) return Math.round((this.practice + this.theory) / 2 + 1);
        else{
            if((this.theory >= 7.5 && this.theory < 8)&& (this.practice >= 7.5 && this.practice < 8)) return Math.round((this.practice + this.theory) / 2 + 0.5);
            else return Math.round((this.practice + this.theory) / 2 );
        }
    }
    public long ChuanPoint(){
        long Standard_point;
        if(Point() > 10 ) Standard_point = 10;
        else Standard_point = Point();
        return Standard_point;
    }
    public String Rank(){
        if(ChuanPoint() < 5) return "Truot";
        else{
            if(ChuanPoint() >= 5 && ChuanPoint() <= 6) return "Trung binh";
            else{
                if(ChuanPoint() == 7) return "Kha";
                else{
                    if(ChuanPoint() == 8) return "Gioi";
                    else return "Xuat sac";
                }
            }
        }
    }
    public int Age(){
        int year = Integer.parseInt(this.born.substring(this.born.length()-4));
        return 2021-year;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + Age() + " " + ChuanPoint() + " " + Rank();
    }
}
 
public class J07053 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("XETTUYEN.in");
        Scanner sc = new Scanner(f);
        List<Xtuyen> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int cnt = 0;
        while(n-- > 0){
            cnt++;
            String s = Integer.toString(cnt);
            while(s.length() < 2) s = "0" + s;
            s = "PH" + s;
            l.add(new Xtuyen(s, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        for (Xtuyen xtuyen : l) {
            System.out.println(xtuyen);
        }
        sc.close();
    }
}