//wap to find what is the day on 1st jan of the inputed year 
import java.util.Scanner;
public class Gregorian_calender {
    public static void main(String[] args){
        int yr,basic_yr = 1900, leap_yr, remaining_yr, total_days, day; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year : ");
        yr = sc.nextInt();
        sc.close();
        yr = (yr - 1)-basic_yr; // cal of total yr b/w basic_yr and input_yr
        //now cal leap yr
        leap_yr = yr/4;  
        //cal the yr which are not leap_yr
        remaining_yr = yr - leap_yr;
        //cal total days present in all the years 
        total_days = (remaining_yr*365)+(leap_yr*366)+1;
        //to find the actual day
        day = total_days % 7;
        if(day==0){
            System.out.println("Monday");
        }
        else if(day==1){
            System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if(day ==4){
            System.out.println("Thursday");
        }
        else if(day == 5){
            System.out.println("Friday");
        }
        else if(day == 6){
            System.out.println("Saturday");
        }
        else if(day == 7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("invalid inputs");
        }
    }
}