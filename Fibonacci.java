import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,num1=0,num2=1,num3=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();

        System.out.print(num1+", "+num2+", ");
        for (int i=0;i<n-2;i++)
        {
            num3=num1+num2;
            System.out.print(num3+", ");
            num1=num2;
            num2=num3;
        }

    }
}
