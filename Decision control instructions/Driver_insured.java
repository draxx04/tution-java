//checking if the driver is insured or not
import java.util.Scanner;
public class Driver_insured {
    public static void main(String[] args){
        int age;
        char ms, sex;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the driver's Marital Status (Y/N) : ");
        ms = sc.next().charAt(0);
        System.out.println("enter the age of the driver  : ");
        age = sc.nextInt();
        System.out.println("enter the sex of the driver (M/F): ");
        sex = sc.next().charAt(0);
        sc.close();

        //without using logical operators : 
        /* 
        if ((ms == 'Y')||( ms == 'y')){
            System.out.println("Driver is insured");
        }
        else{
            if((sex == 'M')||(sex == 'm')){
                if(age > 30){
                    System.out.println("Driver is insured");
                }
                else{
                    System.out.println("Driver is not insured");
                }
            }   
            else{
                if((sex == 'F')||(sex =='f')){
                if(age>25)
                System.out.println("driver is insured");
                else{
                    System.out.println("driver is not insured");
                }
                }
            }    

        }
        */

        //with using of logical operator && and ||
        
        if((ms=='y')||(ms=='n')&&(sex=='m')&&(age>30)||(ms == 'n')&&(sex =='f')&&(age>25)){
            System.out.println("the driver is insured");
        }
        else {
            System.out.println("the driver is not insured");
        }
    }
}
