package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double miles;
        double gas;
        double mpg;
        System.out.println("Please enter the number of miles driven:");
        miles = input.nextDouble();
        System.out.println("Please enter the amount of gas you've consumed:");
        gas = input.nextDouble();
        input.close();
        mpg = miles / gas;
        System.out.println("You're miles per gallon is: " + mpg);
    }
}
