import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year=sc.nextInt();
        String str="";
        if(year%100==0)
        {
            if(year%400==0) {str="Artik yildir";}
            else
                str="Artik yil degildir.";
        }
        else
        {
            if(year%4==0)
            {
                str="Artik yildir";
            }
            else
            {str="Artik yil degildir";}

        }

        System.out.println(year+" "+str);
    }
}
