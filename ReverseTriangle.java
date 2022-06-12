import  java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter a number: ");
            n=sc.nextInt();

            for(int i=n-1;i>0;i--)
            {
                for(int j=n-i;j>0;j--)
                {
                    System.out.print(" ");
                }
                for(int k=(2*i)-1;k>0;k--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }while (n>0);
    }
}
