import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] agrs) {

        boolean run = true;

        while (run){

            try {

                Scanner sr = new Scanner(System.in);

                System.out.println("Enter the first number");
                double num1 = sr.nextDouble();

                System.out.println("Enter the second number");
                double num2 = sr.nextDouble();

                System.out.println("Enter a number to choose to Subtract, Add, Multiply, or Divide the numbers");
                System.out.println("\n 1 = Add");
                System.out.println("\n 2 = Subtract");
                System.out.println("\n 3 = Multiply");
                System.out.println("\n 4 = Divide");

                while (run){

                    int num3 = sr.nextInt();

                    if(num3 == 1) {

                        System.out.println(num1 + num2);

                        run = false;

                    }else if(num3 == 2){

                        System.out.println(num1 - num2);

                        run = false;

                    }else if(num3 == 3) {

                        System.out.println(num1 * num2);

                        run = false;

                    }else if(num3 == 4) {

                        System.out.println(num1 / num2);

                        run = false;

                    }else {

                        System.err.println("That is an invalid input please enter a valid input!");

                        run = true;

                        continue;


                    }

                }



            }catch (InputMismatchException e) {

                System.err.println("That is an invalid input please try again");



            }

        }
    }
}
