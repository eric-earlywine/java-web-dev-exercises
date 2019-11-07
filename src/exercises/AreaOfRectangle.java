package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        int length = input.nextInt();
        System.out.println("Please enter the width of the rectangle:");
        int width = input.nextInt();
        int area = length * width;
        input.close();
        System.out.println("The area of the rectangle is: " + area);
    }
}
