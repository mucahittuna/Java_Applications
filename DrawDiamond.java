import java.util.Scanner;
import java.lang.*;

//ilk döngü satır atlatır
// ikinci döngü yıldızları bastırır
//3. döngü boşluk bırakır


public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
        for (int i=n-1; i >0 ; i--){

            for (int k=n-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
        }
    }


