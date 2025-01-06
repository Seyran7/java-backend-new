package Turing;

import java.util.Scanner;

public class TheLongestName {
    public static void main(String[] args) {
        LongestName();
    }
        //input
        public static void LongestName(){
        Scanner scan =new Scanner(System.in);
        //proses this code will show the longest entered name

        String enteredName="";
        String longestName="";
        while(!(enteredName.equals("Q")||enteredName.equals("q"))) {
            System.out.println("Enter a name:\nif you want to quit enter 'Q' or 'q':");
            enteredName = scan.nextLine();
            if (enteredName.length() >= longestName.length()) {
                longestName = enteredName;
            }
            System.out.println(longestName);
        }
    }
}

