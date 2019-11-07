package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean good = false;
        String inRad;
        double rad = 0;
        do {
            System.out.println("Please enter the radius of the circle:");
            inRad = input.nextLine();
            if (!inRad.equals("")) {
                try {
                    rad = Double.parseDouble(inRad);
                    if (rad > 0) {
                        good = true;
                        break;
                    } else {
                        System.out.println("A circle can't have a negative radius!");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a number.");
                }
            }
        } while (!inRad.equals("") || !good);
        input.close();
        double area = Circle.getArea(rad);
        System.out.println("The area of the circle is: " + area);
    }
}
