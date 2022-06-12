import java.util.Scanner;

public class SumOfMod3and4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,sum=0,numOfNum=0,average=0;
        System.out.println("Enter a number: ");
        number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(i%3==0 && i%4==0) { sum+=i; numOfNum++; }
        }
        if(numOfNum>0)
        { average=(sum/numOfNum);} else average=0;

        System.out.println("Average of the number: "+average);
    }
}
