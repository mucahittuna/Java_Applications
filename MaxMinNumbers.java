

import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n,maxNum=0,minNum=100;
        System.out.println("How many numbers you will enter: ");
        n=sc.nextInt();

        for (int i=1;i<=n;i++)
        {
            int tmp=0;
            System.out.println("Enter "+i+". number: ");
            tmp=sc.nextInt();

            if(tmp>=maxNum)
            {
                maxNum=tmp;
            }
            else if(tmp<=minNum)
            {
                minNum=tmp;
            }

        }
        System.out.println("Maximum number: "+maxNum);
        System.out.println("Minimum number: "+minNum);

    }
}
