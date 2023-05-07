import java.util.Scanner;
public class Profit_loss {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("the cost price of the item is : ");
        double cp = sc.nextDouble();
        System.out.println("the selling price of the item is : ");
        double sp = sc.nextDouble();
        sc.close();
        if (cp<sp)
            System.out.println("the seller has mad profit of Rs."+(sp-cp));
        else
            System.out.println("the seller has incurred a loss of Rs."+(cp-sp));
        
    }
}
