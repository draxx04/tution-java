
//5. Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.Scanner;

class product2nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        double a = sc.nextDouble();
        System.out.println("enter b :");
        double b = sc.nextDouble();
        sc.close();
        double product = a * b;
        System.out.println("the product of " + a + " & " + b + " is : " + product);
    }
}