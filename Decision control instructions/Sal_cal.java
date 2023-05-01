import java.util.Scanner;;
public class Sal_cal {
    public static void main(String[] agrs)
    {
        char gender;
        int yrs_of_service, qualifications, salary = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender (m/f) : ");
        gender = sc.next().charAt(0);
        System.out.println("enter the years of service : ");
        yrs_of_service = sc.nextInt();
        System.out.println("enter the qualifications (0 - graduate) & (1 - post_graduate) : ");
        qualifications = sc.nextInt();
        sc.close();
        if(gender == 'm')
        {
            if(yrs_of_service>=10 && qualifications == 1){
                salary = 15000;
            }
            else if ((yrs_of_service>=10 && qualifications == 0)||(yrs_of_service<10 && qualifications == 1)){
                salary = 10000;
            }
            else if (yrs_of_service<10 && qualifications == 0){
                salary = 7000;
            }
        }
        else if (gender == 'f')
        {
            if (yrs_of_service>=10 && qualifications == 1){
                salary = 12000;
            }
            else if (yrs_of_service>=10 && qualifications == 0){
                salary = 9000;
            }
            else if (yrs_of_service<10 && qualifications == 1){
                salary = 10000;
            }
            else if (yrs_of_service<10 && qualifications == 0){
                salary = 6000;
            }
        }
        System.out.println("the Salary of the employee is : " +salary);
    }
}
