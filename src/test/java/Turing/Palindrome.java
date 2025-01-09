package Turing;


import java.util.Scanner;

public class Palindrome {
    public Palindrome() {
    }

    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word or a text:");
            String text = scan.nextLine();
            String reversedText = "";

            for(int i = text.length() - 1; i >= 0; --i) {
                reversedText = reversedText + text.charAt(i);
            }

            if (reversedText.equalsIgnoreCase(text)) {
                System.out.println(text + " is palindrome.");
            } else {
                System.out.println(text + " is not palindrome.");
            }
        }
    }
}
