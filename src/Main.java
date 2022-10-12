import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a word");
        String word = scan.nextLine();

        System.out.println("The first half is: " + word.substring(0,word.length()/2));
        System.out.println("The second half is: " + word.substring((word.length()/2)));

        System.out.println("Please input a word");
        String word2 = scan.nextLine();

        if (word2.length() > word.length()) {
            System.out.println(word2 + " is longer");
        } else if (word.length() > word2.length()){
            System.out.println(word + " is longer");
        } else {
            System.out.println("The two strings have the same length");
        }

        if (word.compareTo(word2) > 0) {
            System.out.println(word2 + " is first alphabetically");
        } else if (word.compareTo(word2) < 0) {
            System.out.println(word + " is first alphabetically");
        } else  if (word.equals(word2)){
            System.out.println("The two words are the same");
        }

        if (word.indexOf(word2) != -1) {
            System.out.println(word2 + " is in " + word + " at index " + word.indexOf(word2));
        } else {
            System.out.println(word2 + " is not in " + word);
        }
    }
}
