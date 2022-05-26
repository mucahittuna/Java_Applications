import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner i= new Scanner(System.in);

        double a,b,c,area=1,u,sqofarea;
        System.out.println("a: ");a=i.nextDouble();
        System.out.println("b: ");b=i.nextDouble();
        System.out.println("c: ");c=i.nextDouble();

        u=(a+b+c)/2;

        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));


        System.out.printf("Area of the Triangle is %f", area);




    }
}
