import java.util.Scanner;

public class BodyMassIndex
{
    public static void main(String[] args)
    {
        Scanner i=new Scanner(System.in);
        double kg,boy,Index;
        System.out.println("Kg: ");  kg=i.nextDouble();
        System.out.println("boy(m): "); boy=i.nextDouble();
        Index=kg/(boy*boy);
        System.out.printf("Body Mass Index is %f",Index);

    }
}
