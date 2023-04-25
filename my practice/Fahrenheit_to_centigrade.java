
//Conversion from fahrenheit to centigrade :
import java.util.Scanner;

class Fahrenheit_to_centigrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter degree in fahrenheit : ");
        double fahrenheit = sc.nextDouble();
        sc.close();
        double centigrade = (fahrenheit - 32) * 5 / 9;
        System.out.println("temperature in centigrade is : " + centigrade);
        System.out.println("\ntemperature in farenheit " + fahrenheit + "& temperature in centigrade " + centigrade);
    }
}
