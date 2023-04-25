
//if total selling price of 15 items and total profit earned on them is input through keyboard. 
//wap to find the cost price of one product.
import java.util.Scanner;

public class Find_costprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total selling price of 15 items : ");
        double sp = sc.nextDouble();
        System.out.println("the profit earned on the 15 items : ");
        double profit = sc.nextDouble();
        sc.close();
        double costprice = (int) (sp - profit) / 15; // Cp of one product
        System.out.println("The Cost price of one product is : " + costprice);

    }

}
