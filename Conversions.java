import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Rowan
 * @version 8/22/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. light years to miles");
        System.out.println("8. Miles to light years");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
        System.out.println("Enter Fahrenheit: ");
        double fahrenhei = keyboard.nextDouble();
        keyboard.nextLine(); // clear buffer
        double celsius = (fahrenhei - 32) * (5.0 / 9.0);
        System.out.println(fahrenhei + " degrees Fahrenheit is " + celsius + " degrees Celsius");
        }
        if (selection ==7)
        {
        System.out.println("Enter number of light years: ");
        double lightYears = keyboard.nextDouble();
        keyboard.nextLine();
        double miles = lightYears * 5.879e12;
        System.out.println(lightYears + " light years is approximately " + miles + " miles.");
        }
        if (selection == 8)
        {
        System.out.println("Enter number of miles: ");
        double miles = keyboard.nextDouble();
        keyboard.nextLine();
        double lightYears = miles / 5.879e12;
        System.out.println(miles + " miles is approximately " + lightYears + " light years.");
        }
        //add more if statements here.

    }

}
