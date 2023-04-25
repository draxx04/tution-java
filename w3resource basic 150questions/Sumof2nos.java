
//2. Write a Java program to print the sum of two numbers.
import java.util.Scanner;

class Sumof2nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        double a = sc.nextDouble();
        System.out.println("enter b :");
        double b = sc.nextDouble();
        sc.close();
        double sum = a + b;
        System.out.println("the sum of" + a + " & " + b + "is : " + sum);

    }

}