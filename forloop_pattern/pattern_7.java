package forloop_pattern;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        int i, j, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
