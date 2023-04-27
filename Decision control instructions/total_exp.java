import java.util.Scanner;
public class Total_exp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the quantity of item : ");
        int qty = sc.nextInt();
        System.out.println("enter the price per item : ");
        double price = sc.nextDouble();
        sc.close();
        double discount = 0;
        if (qty > 1000){
            discount = ((qty*price)*10)/100;
            System.out.println("the total discount you get is :" +discount);
        }
        else{
            System.out.println("No discount is given");
        }
        double total_exp = (qty*price) - discount ;
        System.out.println("the total expenses for purchasing the products are : "+total_exp);
    }    
}
