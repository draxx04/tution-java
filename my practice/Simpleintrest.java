
//calculation of simple intrest 
import java.util.Scanner;

class Simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of principle : ");
        double p = sc.nextDouble();
        System.out.println("enter the value of rate : ");
        double r = sc.nextDouble();
        System.out.println("enter the value for time : ");
        double t = sc.nextDouble();
        sc.close();
        double si = (p * r * t) / 100;
        System.out.println("the simple intrest of " + p + ", " + r + ", " + t + "is : " + si);
    }
}