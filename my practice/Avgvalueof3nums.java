
//to calculate the avg value of 3 numbers

import java.util.Scanner;

class Avgvalueof3nums {
    public static void main(String[] args) {

        /*
         * WITHOUT TAKING USER INPUT
         * double a = 20, b = 30, c = 50;
         * double avg = (a + b + c) / 3;
         * System.out.println("the avg of 3 numbers are : " + avg);
         */

        // BY USING USER INPUT SCANNER CLASS
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("enter the value of c : ");
        double c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("the average of" + a + ", " + b + ", " + c + " is " + avg);
        sc.close();

    }
}