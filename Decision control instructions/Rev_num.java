
// reverse number using recursion function
import java.util.Scanner;

public class Rev_num {
    // creating a method ReverseNumber
    public static void ReverseNumber(int num) {
        if (num < 10)
            System.out.println(num); // ie. print the same number if the number is less than 10
        else {
            System.out.print(num % 10);
            ReverseNumber(num / 10);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to reverse : ");
        num = sc.nextInt();
        sc.close();
        System.out.println("the reverse of the given number is : ");
        ReverseNumber(num); // calling the method
    }
}
