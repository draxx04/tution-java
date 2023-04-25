
//if a 5 digit number is inputed through keyboard
//wap to print a new number by adding 1 to eeach of it's digit
import java.util.Scanner;

public class add_1_to_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 5 digit number : ");
        double num = sc.nextDouble();
        sc.close();
        double add_1digit = num + 11111;
        System.out.println("The new number by adding 1 to eeach of it's digit is : " + add_1digit);
    }

}
