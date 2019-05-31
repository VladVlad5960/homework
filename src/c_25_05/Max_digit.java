package c_25_05;
import java.util.Scanner;

public class Max_digit {
    public static void main(String[] args) {

        int a, b, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        b = sc.nextInt();

        while (b > 0) {
            a = b % 10;
            if (c < a) {
                c = a;
            }
            b = b / 10;
        }

        System.out.println(" Max Digit is :" + c);

    }
}