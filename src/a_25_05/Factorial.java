package a_25_05;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        long num;
        long fact=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        for (long i=2;i<=num; i++){
            fact=fact*i;
        }

        System.out.println("Factorial: "+fact);
    }
    }
