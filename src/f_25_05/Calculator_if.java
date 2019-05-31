package f_25_05;

import java.util.Scanner;
public class Calculator_if {
    public static void main(String[] args) {

            int n1;
            int n2;
            String operation;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti primul numar: ");
            n1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            n2 = scanner.nextInt();
            System.out.println("Introduceti operatia dorita: ");
            operation = scanner.next();


            if (operation.equals("+")) {
                System.out.println("Result is:" + " " + (n1 + n2));
            } else if (operation.equals("-")) {
                System.out.println("Result is:" + " " + (n1 - n2));
            } else if (operation.equals("*")) {
                System.out.println("Result is:" + " " + (n1 * n2));
            } else if (operation.equals("/")) {
                System.out.println("Result is:" + " " + (n1 / n2));
            }
        }
    }
