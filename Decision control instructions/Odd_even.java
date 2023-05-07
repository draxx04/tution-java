import java.util.Scanner;
public class Odd_even {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer : ");
        int i = sc.nextInt();
        sc.close();
        if (i % 2 == 0)
            System.out.println(i+" is an even number");
        else
            System.out.println(i+" is an odd number");        
    }    
}
