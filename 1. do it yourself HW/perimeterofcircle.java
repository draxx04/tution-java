
//to find the circumference of the circle
import java.util.Scanner;

class perimeterofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of r :");
        double r = sc.nextDouble();
        double circumference = 2 * 3.14d * r;
        System.out.println("ther circumference of circle is :" + circumference);
        sc.close();
    }
}
