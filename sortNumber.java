import java.util.Scanner;

public class sortNumber {
    public static void main(String[] args) {
       int a,b,c,maxNum,minNum;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter second number ");
        b=sc.nextInt();
        System.out.println("Enter third number ");
        c=sc.nextInt();

        if (a>=b && b>=c)
        {
            System.out.println(c);System.out.println(b); System.out.println(a);

        }
        else if(a>=c&&c>=b)
        {
            System.out.println(b);System.out.println(c);System.out.println(a);

        }
        else if(b>=a&&a>=c)
        {
            System.out.println(c);System.out.println(a);System.out.println(b);

        }
        else if(b>=c&&c>=a)
        {
            System.out.println(a);System.out.println(c); System.out.println(b);

        }
        else if(c>=a&&a>=b)
        {

            System.out.println(b);System.out.println(a);System.out.println(c);

        }
        else if(c>=b&&b>=a)
        {

            System.out.println(a); System.out.println(b);System.out.println(c);

        }

    }
}
