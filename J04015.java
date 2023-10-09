import java.util.Scanner;

class GiaoVien{
    private String ma,ten;
    private int luong;
    public GiaoVien(String ma, String ten, int luong){
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    public void Kqua(){
        String PhuCap = ma.substring(0, 2);
        int HeSo = Character.getNumericValue(ma.charAt(2)) * 10 + Character.getNumericValue(ma.charAt(3));
        if(PhuCap.equals("HT")) System.out.println(ma + " " + ten + " "+ HeSo +  " 2000000 " + (luong*HeSo+2000000));
        else{
            if(PhuCap.equals("HP")) System.out.println(ma + " " + ten + " "+ HeSo +  " 900000 " + (luong*HeSo+900000));
            else System.out.println(ma + " " + ten + " " + HeSo + " 500000 "+ (luong*HeSo+500000));
        }
    }   
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien A = new GiaoVien(sc.nextLine(),sc.nextLine(), sc.nextInt());
        A.Kqua();
        sc.close();
    }
}
