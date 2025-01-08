package Turinga.Turing;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        while (true) {
            //input
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            //proses;this code will calculate all number's sum in entering number if it's even
                int cem = 0;
                for (int i = 0; i <= num; i++) {
                    if (i % 2 == 0) {
                        cem += i;

                    }
                }
                System.out.println(cem);
        }

    }

}

