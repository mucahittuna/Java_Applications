import java.util.Scanner;

public class SumofEvenanMod4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,sum=0;
        do{
            System.out.println("Enter a number: ");
            num=sc.nextInt();
            if(num%4==0){ sum+=num; }

        }while(num%2==0);

        System.out.println("Sum of multiples of 4:  "+ sum);
    }
}
