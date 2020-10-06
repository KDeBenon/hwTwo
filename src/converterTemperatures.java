//----------------------------------------------------------------------
//  DEVELOPMENT ENVIRONMENT: IntelliJ IDEA
//  WHAT:
//      Title.............tempConverter.java
//      Description:
//          Designed to convert Celsius(C) to Fahrenheit(F) or fahrenheit to celsius.
//
//  WHO:
//      Author............Kendall DeBenon
//
//  WHEN:
//      Inception.........October 4, 2020, 10:08 PM
//      Last changed......October 5, 2020, 11:56 PM
//          by............Kendall DeBenon
//
//  HOW:
//      Input:
//          User needs to input 1 or 2 to convert to Celsius or Fahrenheit.
//          User needs to input desired Celsius or Fahrenheit temperature.
//
//      Public Variables:
//          Only the main method. Private is used for celsiusToFahrenheit and fahrenheitToCelsius
//          methods since im not making calls outside of the class.
//
//      Output:
//          Produces the the conversion of Celsius or Fahrenheit depending on which option was selected by the user.
//
//      Notes:
//          Although I could with the case method since it is slightly quicker. I found that utilizing "if" is more
//          straightforward from a readability standpoint.
//
//          **Important**
//          Calculations not working correctly. Unfortunately I didn't leave myself enough time to fix the issue.
//
//----------------------------------------------------------------


import java.util.Scanner;


public class converterTemperatures {

   private static double celsiusToFahrenheit(double C) // C = Celsius
    {
        double F;
        F = ((C * 5.0 / 9.0) + (32.0));
        return F;
    }

    public static double fahrenheitToCelsius(double F) // F = Fahrenheit
    {
        double C;
        C = ((F * 9.0 / 5.0) - (32.0));
        return C;
    }

    public static void main(String[] args){
        double temp;

        Scanner input = new Scanner(System.in); // allows for user input

        System.out.println("************ Welcome to the temperature converter ************");

        System.out.println("WARNING: Any number other than 1 or 2 will exit out of program. ");

        System.out.println("Input '1' to convert Celsius to Fahrenheit: ");
        System.out.println("Input '2' to convert Fahrenheit to Celsius: ");

            int selection = input.nextInt();


            if (selection == 1) {  // Selects this the Celsius to Fahrenheit option if user inputs '1'.
                System.out.println("Input your temperature in Celsius: ");
                temp = input.nextDouble();
                double calculation = celsiusToFahrenheit(temp);
                System.out.println("Temperature in Fahrenheit: " + calculation);
                System.out.println("Thank You for using the program");
                System.exit(0);
            }

            else if (selection == 2) {  // Selects this Fahrenheit to Celsius option if user inputs '2'.
                System.out.println("Input your temperature in Fahrenheit: ");
                temp = input.nextDouble();
                double calculation = fahrenheitToCelsius(temp) ;
                System.out.println("Temperature in Celsius: " + calculation);
                System.out.println("Thank You for using the program");
                System.exit(0);

            }

            else  {
                System.out.println("Thank You for using the program");
                System.exit(0); //exits out of program if selection is invalid or if conversion is completed
            }

        }

}
