package Turinga.Turing;

import java.util.Scanner;

public class expressionCalculatorApp {
    public static void main(String[]args){
        //input
        while(true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number:");
            Double x = scan.nextDouble();

            //proses
            Double y = x - (Math.pow(x, 2) + 4) / 2 + Math.pow(x, 3) - x / (x + 7);

            System.out.printf("%.3f\n", y);
        }
    }
}
