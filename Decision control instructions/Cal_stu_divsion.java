//by using nested if - else : 
import java.util.Scanner;
class Cal_stu_divsion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of subject 1 :");
        double sub1 = sc.nextDouble();
        System.out.println("enter the marks of subject 2 :");
        double sub2 = sc.nextDouble();
        System.out.println("enter the marks of subject 3 :");
        double sub3 = sc.nextDouble();
        System.out.println("enter the marks of subject 4 :");
        double sub4 = sc.nextDouble();
        System.out.println("enter the marks of subject 5 :");
        double sub5 = sc.nextDouble();
        sc.close();
        double total_sub = sub1+sub2+sub3+sub4+sub5;
        double percent = (total_sub*100)/500;
        if(total_sub<=500)
        {
            if(percent>=60)
                System.out.println("First division");
            else
            {
                if(percent>=50)
                    System.out.println("Second division");
                else if(percent>=40)
                    System.out.println("Third division ");
                else
                    System.out.println("Failed !!!");
            }
        }
        else
        {
            System.out.println("please re run the program and enter the marks again within the range of 0 to 100");
        }
    }
}