//Calculation of Bonus of Employee
import java.util.Scanner;
class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the current year : ");
        int cur_year = sc.nextInt();
        System.out.println("enter the year in which the employee joined : ");
        int yr_of_join = sc.nextInt();
        int yr_of_service = cur_year - yr_of_join;
        sc.close();
        if(yr_of_service > 3){
            int bonus = 2500;
            System.out.println("the employee will get a bonus of Rs. "+bonus);
        }
        else{
            System.out.println("the employee will not get any bonus.");
        }
    }
}