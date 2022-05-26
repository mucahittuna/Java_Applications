import java.util.Scanner;

public class ShoppingProblem
{
    public static void main(String[] args)
    {
        Scanner i= new Scanner(System.in);

        double  PEAR=2.14,kgPear,
                APPLE=3.67,kgApple,
                TOMATOES=1.11,kgTomatoes,
                BANANA=0.95,kgBanana,
                EGGPLANT=5.00,kgEggPlant,
                total=0;

        System.out.println("Domates miktarı(Kg): "); kgTomatoes=i.nextDouble();
        System.out.println("Elma miktarı(Kg): "); kgApple=i.nextDouble();
        System.out.println("Muz miktarı(Kg): "); kgBanana=i.nextDouble();
        System.out.println("Armut miktarı(Kg): "); kgPear=i.nextDouble();
        System.out.println("Patlıcan miktarı(Kg): "); kgEggPlant=i.nextDouble();
        total=(kgTomatoes*TOMATOES)+(kgApple*APPLE)+(kgBanana)*(BANANA+kgPear*PEAR)+(kgEggPlant*EGGPLANT);
        System.out.printf("Toplam Tutar: %f TL",total);
    }
}
