
//gross salary = basic salary + other allowances
import java.util.Scanner;

class CALgrossSALARY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        double basic_salary = sc.nextDouble();
        double dearness_allowance = (basic_salary * 40) / 100;
        double house_rent = (basic_salary * 20) / 100;
        double gross_salary = basic_salary + house_rent + dearness_allowance;
        System.out.println("The gross salary of Ramesh is :" + gross_salary);
        sc.close();
    }
}