import java.util.Scanner;
public class KdvCalculator
{
    public static void main(String[] args)
    {
        Scanner i=new Scanner(System.in);

        double productPrice,withKdv,amountKdv;
        productPrice=i.nextInt();
        withKdv=(productPrice>1000)?withKdv=productPrice+(productPrice*0.08):(productPrice+(productPrice*0.18));
        amountKdv=(productPrice>1000)?amountKdv=(productPrice*0.08):(productPrice*0.18);

        System.out.printf("Fiyat=  %f TL\n",productPrice);
        System.out.printf("KDV'li Fiyat=  %f TL\n",withKdv);
        System.out.printf("KDV Miktari= %f TL\n",amountKdv);
    }
}
