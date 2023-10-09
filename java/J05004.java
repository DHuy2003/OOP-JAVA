import java.util.Scanner;

class Student{
    private String  name, clas, born;
    private double point;
    public String getName() {
        return name;
    }
    public String getClas() {
        return clas;
    }
    public String getBorn() {
        return born;
    }
    public double getPoint() {
        return point;
    }
    public String Xuli(String s){
        char c = s.charAt(0);
        c = Character.toUpperCase(c);
        String tmp = "";
        for(int i = 1; i < s.length(); i++){
            tmp += s.charAt(i);
        }
        tmp = c + tmp;
        return tmp;
    }
    public void setName(String name) {
        name = name.trim();
        name = name.toLowerCase();
        String tmp = "";
        int i = 0;
        while(i < name.length()){
            if(name.charAt(i) == ' '){
                String s = name.substring(0, i);
                tmp = tmp + Xuli(s) + " ";
                name = name.substring(i);
                name = name.trim();
                i = 0;
            }
            i++;
        }
        tmp = tmp + Xuli(name);
        this.name = tmp;
    }
    public void setClas(String clas) {
        this.clas = clas;
    }
   
    public void setBorn(String born) {
        String[] tmp = born.trim().split("/");
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i].length() == 1) tmp[i] = "0" + tmp[i]; 
        }
        this.born = tmp[0] + "/" + tmp[1] + "/" + tmp[2];
    }
    public void setPoint(double point) {
        this.point = point;
    }
    
}
public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Student[] a = new Student[n];
        for(int i = 0; i < n; i++){
            a[i] = new Student(); 
            a[i].setName(sc.nextLine());
            a[i].setClas(sc.nextLine());
            a[i].setBorn(sc.nextLine());
            a[i].setPoint(Double.parseDouble(sc.nextLine()));
        }
        for (int i = 0; i < a.length; i++) {
            String s = Integer.toString(i+1);
            while(s.length() < 3) s = "0" + s;
            System.out.print("B20DCCN" + s + " ");
            System.out.print(a[i].getName() + " " + a[i].getClas() + " " + a[i].getBorn() + " ");
            System.out.printf("%.2f\n",a[i].getPoint());
        }
        sc.close();
    }
}
