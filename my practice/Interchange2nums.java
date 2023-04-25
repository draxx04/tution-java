
//wap to interchange the contents of C and D : 
import java.util.Scanner;

class Interchange2nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of 1st number : ");
        double c = sc.nextDouble();
        System.out.print("enter the value of 2nd number : ");
        double d = sc.nextDouble();
        sc.close();
        System.out.println(
                " Before swaping \nThe value of 1st number is : " + c + " & the value of 2nd number is : " + d);
        /*
         * // by using 3 variables :
         * // c ,d ,temp
         * double temp = 0;
         * temp = c; // in temp the value of c is stored
         * c = d; // in c the value od d is been stored
         * d = temp; // then"" in d the value of tem that is c is been stored
         */

        // by using only 2 variables :
        c = c + d; // 20 + 30 = 50 which is first declared as c
        d = c - d; // 50 - 30 = 20 which is the current value of d
        c = c - d; // 50 - 20 = 30 which is the current value of c
        System.out
                .println(" After swaping \nThe value of 1st number is : " + c + " & the value of 2nd number is : " + d);

    }
}