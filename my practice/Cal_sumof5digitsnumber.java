import java.util.Scanner;

class Cal_sumof5digitsnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 5 digit number : ");
        double num = sc.nextDouble();
        sc.close();
        double sum = 0;
        while (num > 0) {
            double temp1 = num % 10;
            sum = sum + temp1;
            num = (int) num / 10;
        }
        System.out.println("the sum of the digits of 5 digit number is : " + sum);
    }
}
