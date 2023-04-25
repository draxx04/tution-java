import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        sc.close();
        int r1 = 0; // initialization of variable r1 as 0
        // run loop until num is 0
        while (n != 0) {
            int lastdigit = n % 10; // it takes the lastdigit out Eg : 987 % 10 = gives the remainder i.e. 7

            r1 = (r1 * 10) + lastdigit; // here 0*10 + 7 will be added i.e. 7
            n /= 10; // here the last digit of 987 i.e. 7 is been deleted
            // then after these steps again the next digit i.e. 98 is been taken and the
            // process is repeated.
        }
        System.out.println("the reversed number is : " + r1);
    }
    /*
     * // this is the code from web :
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("enter the number : ");
     * int num = sc.nextInt(), reversed = 0;
     * sc.close();
     * 
     * System.out.println("Original Number: " + num);
     * 
     * // run loop until num becomes 0
     * while (num != 0) {
     * 
     * // get last digit from num
     * int digit = num % 10;
     * reversed = reversed * 10 + digit;
     * // remove the last digit from num
     * num /= 10;
     * }
     * System.out.println("Reversed Number: " + reversed);
     * }
     */
}
