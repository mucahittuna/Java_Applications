import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        double mat,fizik,turk,kim,total=0,average,num=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Math notes: ");
        mat= sc.nextDouble();
        System.out.println("Enter Physics notes: ");
        fizik= sc.nextDouble();
        System.out.println("Enter Turks notes: ");
        turk= sc.nextDouble();
        System.out.println("Enter Chemistry notes: ");
        kim= sc.nextDouble();

        if(mat>=0&&mat<=100) { total+=mat; num++;}
        if(fizik>=0&&fizik<=100) { total+=fizik;num++;}
        if(turk>=0&&turk<=100) { total+=turk;num++;}
        if(kim>=0&&kim<=100) { total+=kim;num++;}

        System.out.print("Average: "+ (total/num));



    }
}
