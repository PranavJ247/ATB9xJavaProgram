package Oct.ex_03102024;

import java.util.Scanner;
public class simplecalculator
{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");

        int num2 = scanner.nextInt();

        System.out.print("Enter the type of calculation, selet mul,add,divide,subtract by entering 1,2,3,4 resply");

        int task = scanner.nextInt();

        switch (task)
        {
            case 1:

                // Perform addition
                int mul = num1 * num2;

                // Display the result
                System.out.println("The multiplication  of " + num1 + " and " + num2 + " is: " + mul);
                break;

            case 2:

                // Perform addition
                int add = num1 + num2;

                // Display the result
                System.out.println("The addition  of " + num1 + " and " + num2 + " is: " + add);
                break;

            case 3:

                // Perform addition
                float  div = num1 / num2;

                // Display the result
                System.out.println("The division  of " + num1 + " and " + num2 + " is: " + div);
                break;

            case 4:

                // Perform addition
                int sub = num1 - num2;

                // Display the result
                System.out.println("The subtraction  of " + num1 + " and " + num2 + " is: " + sub);

                scanner.close();
        }
    }
}