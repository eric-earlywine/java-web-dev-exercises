package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Please enter a search term:");
        String search = input.nextLine();
        input.close();
        System.out.println(alice.length());
        if (alice.toLowerCase().contains(search.toLowerCase())) {
            int start = alice.toLowerCase().indexOf(search.toLowerCase());
            System.out.println(search + " was found at index: " + start + " and has a length of: " + search.length());
            int end = start + search.length();
            alice = alice.substring(0, start) + alice.substring(end);
            System.out.println(alice);
        }
        else {
            System.out.println(search + " was not found.");
        }
    }
}
