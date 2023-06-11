package forloop_pattern;

import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        int i, j, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
