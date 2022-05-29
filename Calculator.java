import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int num1,num2,operation;

        Scanner i=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1=i.nextInt();
        System.out.println("Enter Second Number: ");
        num2=i.nextInt();
        System.out.println("Enter Operation type: Sum = 1 , Sub = 2 , Multiple = 3 , Division = 4 ");
        operation=i.nextInt();
        switch (operation)
        {
            case 1:
                System.out.println("Result is " + (num1+num2) );
                break;
            case 2:
                System.out.println("Result is " + (num1-num2) );
                break;
            case 3:
                System.out.println("Result is " + (num1*num2) );
                break;
            case 4:
                System.out.println("Result is " + (num1/num2) );
                break;
            default:
                System.out.println("Please check your inputs");
        }




    }
}
