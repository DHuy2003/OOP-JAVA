import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

class Khang implements Comparable<Khang> {
    String id, name, room;
    int day, price;   
    public Khang(String id, String name, String room, int day, int price){
        this.id = id;
        this.name = name;
        this.room = room;
        this.day = day;
        this.price = price;
    }
    public int compareTo(Khang a){
        if(this.price < a.price) return 1;
        else return -1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + room + " " + day + " " + price;
    }
}

public class J07051 {
    public static String Xuli(String s){
        char c = s.charAt(0);
        c = Character.toUpperCase(c);
        String tmp = "";
        for(int i = 1; i < s.length(); i++){
            tmp += s.charAt(i);
        }
        tmp = c + tmp;
        return tmp;
    }
    public static String[] Time(String s){
        String tmp[] = s.trim().split("/");
        return tmp;
    }
    public static String Chuan(String s){
        String tmp[] = s.trim().split("/");
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i].length() == 1){
                tmp[i] = "0" + tmp[i]; 
            }
        }
        return tmp[0] + "/" + tmp[1] + "/" + tmp[2];
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("KHACHHANG.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        List<Khang> list = new ArrayList<>();
        int cnt= 0;
        while(n-- > 0){
            cnt++;
            String id = "KH";
            if(cnt < 10) id = id + "0" + Integer.toString(cnt);
            else id = id + Integer.toString(cnt);
            String name = sc.nextLine();
            name = name.trim();
            name = name.toLowerCase();
            String Name = "";
            int i = 0;
            while(i < name.length()){
                if(name.charAt(i) == ' '){
                    String tmp = name.substring(0, i);
                    Name = Name + Xuli(tmp) + " ";
                    name = name.substring(i);
                    name = name.trim();
                    i = 0;
                }
                i++;
            }
            Name = Name + Xuli(name);
            String room = sc.nextLine().trim();
            String join = Chuan(sc.nextLine());
            String left = Chuan(sc.nextLine());
            String[] joinday = Time(join);
            String[] leftday = Time(left);
            long days = LocalDate.of(Integer.parseInt(joinday[2]),Integer.parseInt(joinday[1]),Integer.parseInt(joinday[0])).until(LocalDate.of(Integer.parseInt(leftday[2]), Integer.parseInt(leftday[1]), Integer.parseInt(leftday[0])),ChronoUnit.DAYS) ;
            int price = Integer.parseInt(sc.nextLine());
            int day = (int)days + 1;
            if(room.charAt(0) == '1') price += 25*day;
            else{
                if(room.charAt(0) == '2') price += 34*day;
                else{
                    if(room.charAt(0) == '3') price += 50*day;
                    else price += 80*day;
                }
            }
            list.add(new Khang(id, Name, room, day, price));
        }
        Collections.sort(list);
        list.forEach(e ->{
            System.out.println(e);
        });
        sc.close();
    }
}
