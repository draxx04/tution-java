import java.util.Scanner;
class Gross_salary {
    public static void main(String[] args){
        double hra;
        double da;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary of the employee : ");
        double basic_sal = sc.nextDouble();
        if(basic_sal< 1500){
            hra = (basic_sal * 10)/100;
            System.out.println("the HRA = " +hra);
            da = (basic_sal * 90)/100;
            System.out.println("the DA = "+da);
        }
        else{
            hra = 500;
            System.out.println("the HRA = "+hra);
            da = (basic_sal*98)/100;
            System.out.println("the DA = "+da);
        }
        double gross_sal = basic_sal + hra+ da;
        System.out.println("the Gross salary of the employee is : " +gross_sal);
        sc.close(); 
    }
}
