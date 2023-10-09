import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Spham implements Comparable<Spham> {
    String id, name;
    int price, time;
    public Spham(String id, String name, int price, int time){
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
    }
    public int compareTo(Spham a){
        if(this.price != a.price){
            if(this.price < a.price) return 1;
        }
        else{
            if(this.id.compareTo(a.id) > 0) return 1;
            else return -1;
        }
        return -1;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + price + " " + time;
    }
}


public class J07048 {
    public static void main(String[] args) throws FileNotFoundException  {
        File file = new File("SANPHAM.in");
        Scanner read = new Scanner(file);
        List <Spham> list = new ArrayList<>();
        int n = Integer.parseInt(read.nextLine());
        while(n-- > 0){
            list.add(new Spham(read.nextLine(), read.nextLine(), Integer.parseInt(read.nextLine()), Integer.parseInt(read.nextLine())));
        }
        Collections.sort(list);
        list.forEach(e ->{System.out.println(e); });
        read.close();
    }
}
