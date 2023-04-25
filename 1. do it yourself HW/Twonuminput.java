
// to take two numbers as input and find its add, sub, multi, divisions
import java.util.Scanner;

class Twonuminput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("enter the value of b : ");
        double b = sc.nextDouble();
        sc.close();
        double add = a + b;
        double sub = b - a;
        double multi = a * b;
        double div = b / a;
        System.out.println("the addition of two numbers:" + add);
        System.out.println("the substraction of two numbers : " + sub);
        System.out.println("the multiplication of two numbers :" + multi);
        System.out.println("the division of two numbers : " + div);
    }
}