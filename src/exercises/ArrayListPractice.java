package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 6, 7, 12, 6, 9, 2, 8, 1, 5));
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newStr = str.split(" ");
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(newStr));
        print5(arr2);
        System.out.println(sum(arr1));
    }
    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
    public static void print5(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        boolean good = false;
        String line;
        int len = 0;
        do {
            System.out.println("Please enter the word length desired:");
            line = input.nextLine();
            if (!line.equals("")) {
                try {
                    len = Integer.parseInt(line);
                    if (len > 0) {
                        good = true;
                        break;
                    } else {
                        System.out.println("The length can only be a positive number!");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        } while (!line.equals("") || !good);
        for (String word : words) {
            if (word.length() == len) {
                System.out.println(word);
            }
        }
    }
}
