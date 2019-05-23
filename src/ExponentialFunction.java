import java.util.Scanner;

public class ExponentialFunction
{

    public static void main(String[] args)
    {


        Scanner input = new Scanner(System.in);

        while (true)
        {
            double x = 0, temp = 1, approx= 1;
            System.out.println("Please enter a number: ");
            x = input.nextDouble();

            for (int i = 0; i < 10; i++)
            {
                temp *= (x / (i + 1));
                approx += temp;
                System.out.println("e^" + x + " is " + approx + " using " + (i + 1) + "terms");
            }

            temp = 1;
            approx = 1;

            for (int i = 0; i < 50; i++)
            {
                temp *= (x / (i + 1));
                approx += temp;
            }
            System.out.println("e^" + x + " is " + approx + " using 50 terms");

            temp = 1;
            approx = 1;

            for (int i = 0; i < 100; i++)
            {
                temp *= (x / (i + 1));
                approx += temp;
            }
            System.out.println("e^" + x + " is " + approx + " using 100 terms");

            System.out.println("Enter \" Exit \" to quit or anything else to continue: ");
            String selection = input.next();
            if (selection.equalsIgnoreCase("Exit"))
            {
                System.out.println("Exiting Program");
                System.exit(0);
            }
            else
            {
                continue;
            }
        }

    }
}
