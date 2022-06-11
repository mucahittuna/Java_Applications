import java.util.Scanner;

public class WeatherActivites
{
    public static void main(String[] args) {
        int heat;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter degree :  ");
        heat=sc.nextInt();
        if(heat<=5){ System.out.print(" Weather is good for ski ");}
        else if(heat>5&&heat<=15){ System.out.print(" Weather is good for Cinema ");}
        else if(heat>15&&heat<=25){ System.out.print(" Weather is good for Picnic ");}
        else { System.out.print(" Weather is good for Swimming ");}

    }
}
