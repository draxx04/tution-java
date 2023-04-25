
//take input 5 subject marks and find out marks percentage: 
import java.util.Scanner;

class Markspercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks of english : ");
        double eng = sc.nextDouble();
        System.out.print("enter the marks for science : ");
        double sci = sc.nextDouble();
        System.out.print("enter the makrs for maths : ");
        double maths = sc.nextDouble();
        System.out.print("enter the marks for computer : ");
        double comp = sc.nextDouble();
        System.out.print("enter the marks for social studies : ");
        double sst = sc.nextDouble();
        sc.close();
        double total_marks_percentage = (((eng + sci + maths + sst + comp) / 500) * 100);
        System.out.println("the total marks percentage of all the subjects are :" + total_marks_percentage);
    }
}