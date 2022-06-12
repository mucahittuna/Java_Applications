import  java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean prime=false;
        for(int i=2;i<100;i++)
        {
            int tmp=0;
           for(int j=2;j<i;j++)
           {

              if(i%j==0)
              {
                tmp++ ;
              }

           }
           if(tmp==0){
               System.out.print(i+", ");
           }
        }
    }
}
