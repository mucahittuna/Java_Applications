import java.util.Scanner;

public class AreaofCircle
{
    public static void main(String[] args)
    {
        Scanner i= new Scanner(System.in);

        double r,a,pi=3.14;

        System.out.println("Yaricapi giriniz: ");
        r=i.nextDouble();
        System.out.println("Merkez aci giriniz: ");
        a=i.nextDouble();

        System.out.println(pi*(r*r)*a/360);


    }
}
