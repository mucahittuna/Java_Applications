import java.util.Arrays;

public class RepeatedElement {

    static void repeatedFinder(int[] arr)
    {
        for(int i=0;i<arr.length;)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {

                if(arr[i]==arr[j])
                {
                   count++;
                }
            }
            System.out.println(arr[i]+" is repeated "+count+" times.");
            i+=count;
        }
    }
    public static void main(String[] args) {

        int[] arr={54,54,78,86,86,95,95,95,86,76,76,76,45,45,45};
        repeatedFinder(arr);

    }
}
