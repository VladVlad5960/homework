package e_25_05;
import java.util.Scanner;
public class PrimeNumbers {
        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int i =0;
            int num =0;
            //Empty String
            String  primeNumbers = "";
            System.out.println("Enter your number:");
            int n = scanner.nextInt();
            scanner.close();
            for (i = 1; i <= n; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers lower than your number are:");
            System.out.println(primeNumbers);
        }
    }

