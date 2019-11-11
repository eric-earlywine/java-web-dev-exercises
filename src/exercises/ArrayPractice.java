package exercises;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newStr = str.split(" ");
        String[] newStr2 = str.split("\\.");
        System.out.println(Arrays.toString(newStr));
        System.out.println(Arrays.toString(newStr2));
        for (int i : arr) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
