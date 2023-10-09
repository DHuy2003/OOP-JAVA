import java.math.BigInteger;
import java.util.Scanner;
class Phanso{
    private BigInteger tu;
    private BigInteger mau;
    public void Rutgon(){
        BigInteger UCLN = tu.gcd(mau);
        tu = tu.divide(UCLN);
        mau = mau.divide(UCLN);
    }
    public Phanso(){
        
    }
    public Phanso(BigInteger tu, BigInteger mau){
        this.tu = tu;
        this.mau = mau;
        Rutgon();
    }
    public BigInteger getTu(){
        return tu;
    }
    public BigInteger getMau(){
        return mau;
    }
    public  void Tong(Phanso p2){
        BigInteger c = (this.mau.multiply(p2.mau)).divide(this.mau.gcd(p2.mau));
        BigInteger d = (c.divide(this.mau)).multiply(this.tu).add((c.divide(p2.mau)).multiply(p2.tu));
        System.out.println(d + "/" + c);
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger tu1 = new BigInteger(sc.next());
        BigInteger mau1 = new BigInteger(sc.next());
        BigInteger tu2 = new BigInteger(sc.next());
        BigInteger mau2 = new BigInteger(sc.next());
        Phanso p1 = new Phanso(tu1, mau1);
        Phanso p2 = new Phanso(tu2, mau2);
        p1.Tong(p2);
        //System.out.println(kq.getTu() + "/" + kq.getMau());
        sc.close();
    }
}