
import java.util.Scanner;
public class TicketCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------Calculator------------\n\n");
        int distance,age,type;
        double price,TL=0.10;
        System.out.println("Enter the distance: ");
        distance=sc.nextInt();
        System.out.println("Enter your age : ");
        age=sc.nextInt();
        System.out.println("Enter the trip type ( For One-way ticket press 1 For round-trip press 2): ");
        type=sc.nextInt();

        if(distance<0||age<0||(type>2&&type<1))
        {
            System.out.println("ERROR\n\n Please enter valid inputs ");
        }

        if(age<12)
        {
            price=distance*TL*0.5;
             if(type==2) { price=price*1.6;}
        }
        else if(age>=12&&age<=24)
        {
            price=distance*TL*0.9;
            if(type==2) { price=price*1.6;}
        }
        else if(age>65)
        {
            price=distance*TL*0.7;
            if(type==2) { price=price*1.6;}
        }
        else
        {
            price=distance*TL;
            if(type==2) { price=price*1.6;}

        }

        System.out.println("\n\n---------Cost: "+ price+" TL");
    }
}