import java.util.Scanner;

class Point{
    private double a,b;
    public Point(){

    };
    public Point(double x, double y){
        this.a = x;
        this.b = y;
    };
    public Point(Point p){
        this.a =p.a ;
        this.b =p.b;
    };
    public double getX(){
        return a;
    }
    public double getY(){
        return b;
    }
    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.a-secondPoint.a, 2)+ Math.pow(this.b-secondPoint.b, 2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.a-p2.a, 2)+ Math.pow(p1.b-p2.b, 2));
    }
    public String toString(){
        return "Distance is";
    };
}

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double edge1 = Point.distance(p1, p2);
            double edge2 = Point.distance(p2, p3);
            double edge3 = Point.distance(p1, p3);
            if(edge1 + edge2 <= edge3 || edge1+edge3 <= edge2 || edge2 + edge3 <= edge1) System.out.println("INVALID");
            else{
                System.out.format("%.2f",Math.sqrt((edge1 + edge2 + edge3)*(edge1 + edge2 - edge3)*(- edge1 + edge2 + edge3)*(edge1 - edge2 + edge3))/4);
                System.out.println();
            }
        }
        sc.close();
    }
}

