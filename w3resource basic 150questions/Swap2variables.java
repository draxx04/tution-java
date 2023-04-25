
//15. Write a Java program to swap two variables.
import java.util.Scanner;

class Swap2variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, temp;
        System.out.println("enter the first no: ");
        a = sc.nextDouble();
        System.out.println("enter the second no: ");
        b = sc.nextDouble();
        sc.close();
        temp = a;
        a = b;
        b = temp;
        System.out.println("the swapped values are :" + a + " and " + b);

    }
}