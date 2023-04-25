
//CONVERT and print distance in meters , feet , inches and centimeters: 
import java.util.Scanner;

class Convertdistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the distance between city 1 and city 2 in km. : ");
        double km = sc.nextDouble();
        double meters = km * 1000;
        System.out.println("the distance " + km + "km in meter is : " + meters + " m");
        double feet = (km * 100000) / 30;
        System.out.println("the distance " + km + "km in feet is : " + feet + " feet");
        double inches = feet / 12;
        System.out.println("the distance " + km + "km in inches is : " + inches + " inches");
        double centimeters = km * 100000;
        System.out.println("the distance " + km + "km in centimeters is : " + centimeters + "cm");
        sc.close();
    }
}