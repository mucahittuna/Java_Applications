import java.util.Scanner;

public class SignFinder {
    public static void main(String[] args) {
        int month,day;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter month you born");
        month=input.nextInt();
        System.out.println("Enter day you born");
        day=input.nextInt();

        if(month==3&&day>=21) { System.out.println("Koç burcu "); }
        else if(month==4&&day<=20) { System.out.println("Koç burcu "); }
        else if(month==4&&day>=21) { System.out.println("Boga burcu "); }
        else if(month==5&&day<=21) { System.out.println("Boga burcu "); }
        else if(month==5&&day>=22) { System.out.println("Ikizler burcu "); }
        else if(month==6&&day<=22) { System.out.println("Ikizler burcu "); }
        else if(month==6&&day>22) { System.out.println("Yengec burcu "); }
        else if(month==7&&day<23) { System.out.println("Yengec burcu "); }
        else if(month==7&&day>=23) { System.out.println("Aslan burcu "); }
        else if(month==8&&day<23) { System.out.println("Aslan burcu "); }
        else if(month==8&&day>=23) { System.out.println("Başak burcu "); }
        else if(month==9&&day<23) { System.out.println("Başak burcu "); }
        else if(month==9&&day>=23) { System.out.println("Terazi burcu "); }
        else if(month==10&&day<23) { System.out.println("Terazi burcu "); }
        else if(month==10&&day>=23) { System.out.println("Akrep burcu "); }
        else if(month==11&&day<22) { System.out.println("Akrep burcu "); }
        else if(month==11&&day>=22) { System.out.println("Yay burcu "); }
        else if(month==12&&day<22) { System.out.println("Yay burcu "); }
        else if(month==12&&day>=22) { System.out.println("Oglak burcu "); }
        else if(month==1&&day<22) { System.out.println("Oglak burcu "); }
        else if(month==1&&day>=22) { System.out.println("Kova burcu "); }
        else if(month==2&&day<20) { System.out.println("Kova burcu "); }
        else if(month==2&&day>19) { System.out.println("Balik burcu "); }
        else if(month==3&&day<21) { System.out.println("Balik burcu "); }





    }
}
