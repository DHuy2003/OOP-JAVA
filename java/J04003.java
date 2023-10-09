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
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger tu = new BigInteger(sc.next());
        BigInteger mau = new BigInteger(sc.next());
        Phanso P = new Phanso(tu,mau);
        System.out.println(P.getTu() + "/" + P.getMau());
        sc.close();
    }
}
