package output;

public class Main_e {
    public static void main(String[] args){
        float a = 12.25f;
        float b = 12.52f;
        if (a == b)
            System.out.println("both a nd b are equal");
        else if (a>b)
            System.out.println("a is greater than b");
        else if(a<b)
            System.out.println("b is greater than a ");
        else if (a%2 == b %3) 
            System.out.println("carpatians");
    }    
}
