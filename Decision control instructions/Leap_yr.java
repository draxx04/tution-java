//to check where it is leap year or not 
import java.util.Scanner;
class leap_yr{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year : ");
        int yr = sc.nextInt(); 
        sc.close();
        if (yr % 4 == 0 || yr%400 ==0){
            System.out.println(yr+ " it is a leap year ");
        }
        else {
            System.out.println(yr+" it is not a leap year ");
        } 

    }
}