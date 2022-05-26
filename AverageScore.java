import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner i=new Scanner(System.in);
        String status;


        int mat,chem,phs,total,avg;

        System.out.println("Enter mat score: ");
        mat=i.nextInt();
        System.out.println("Enter Chemistry score: ");
        chem=i.nextInt();
        System.out.println("Enter physics score: ");
        phs=i.nextInt();

        total=mat+chem+phs;
        avg=total/3;
        status=(avg>=60)?status="Gecti":"Kaldi";
        System.out.println(status);

    }
}
