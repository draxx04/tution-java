
//program to calculate the area of rectangle
import java.util.Scanner;

class Area_peri_ofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of length : ");
        double L = sc.nextDouble();
        System.out.print("enter value of breadth : ");
        double B = sc.nextDouble();
        sc.close();
        double area = L * B; // formula
        double peri = 2 * (L + B);
        System.out.println("the area of rectangle is :" + area);
        System.out.println("the perimeter of rectangle is : " + peri);
    }
}
