import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of radius");
        double r = sc.nextDouble();
        sc.close();
        double area = (22 * r * r) / 7;
        System.out.println("the area of circle is : " + area);
    }
}