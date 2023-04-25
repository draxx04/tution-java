
//3. Write a Java program to divide two numbers and print on the screen.
import java.util.Scanner;

class Divide2nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = sc.nextDouble();
        System.out.println("enter b : ");
        double b = sc.nextDouble();
        sc.close();
        double div = a / b;
        System.out.println("the division of " + a + " & " + b + "is : " + div);
    }
}