import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, sum = 0;

        System.out.println("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println(number+ " is a perfect number. ");
        }else System.out.println(number + " is not a perfect number");
    }
}
