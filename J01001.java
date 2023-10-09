import java.util.Scanner;

public class J01001 {
    public static void main(String[] args){
        Scanner inpt = new Scanner(System.in);
        long x = inpt.nextLong();
        long y = inpt.nextLong();
        if(x <= 0 || y <= 0) System.out.print(0);
        else{
            long z = (x+y) * 2;
            System.out.print(z);
            System.out.print(" ");
            System.out.println(x*y);
        }
        inpt.close();
    }
}