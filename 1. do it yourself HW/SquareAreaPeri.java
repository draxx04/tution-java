
//find the area and perimeter of square
import java.util.Scanner;

class SquareAreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length 'L' :");
        double l = sc.nextDouble();
        sc.close();
        double area = l * l;
        double perimeter = 4 * l;
        System.out.println("the area of square is : " + area);
        System.out.println("the perimeter of square is :" + perimeter);
        sc.close();
    }
}
