import java.util.Arrays;
import java.util.Scanner;

public class SortingElement{

    public static void main(String[] args)
    {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Array's length: ");
        n=input.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+". index: ");
            array[i]=input.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Ordered: "+Arrays.toString(array));

    }
}
