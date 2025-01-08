package Turinga.Turing;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        //input
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir metin elave edin:");
            String text = scan.nextLine();
            //proses This code will reverse the text which is entered in console
            String reversedText = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversedText += text.charAt(i);
            }
            System.out.println(reversedText);
        }
    }
}
