
//7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;

class multiplicationupto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number : ");
        double a = sc.nextDouble();
        sc.close();
        for (double i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));

        }
    }
}