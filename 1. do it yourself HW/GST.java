
//imput 4 product price and then addd 18%GST and find out the total amount. 
import java.util.Scanner;

class GST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the price of product 1 : ");
        double pro1 = sc.nextDouble();
        System.out.print("enter the price of product 2 : ");
        double pro2 = sc.nextDouble();
        System.out.print("enter the price of product 3 : ");
        double pro3 = sc.nextDouble();
        System.out.print("enter the price of product 4 : ");
        double pro4 = sc.nextDouble();
        sc.close();
        double productprice = (pro1 + pro2 + pro3 + pro4);
        double _18percentgst_ = (productprice * (18 / 100)); // formula for 18%gst
        double total_amount = productprice + _18percentgst_;
        System.out.println("the total amount with gst of the 4 products is : " + total_amount);

    }
}