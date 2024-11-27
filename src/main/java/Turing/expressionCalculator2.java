package Turing;

import java.util.Scanner;

public class expressionCalculator2 {
    public static void main(String[]args){

        //input
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number for x:");

        Double x=scan.nextDouble();

        //proses
        Double y=((2*x-1)/Math.pow(x,2)+Math.sqrt(Math.pow(x,2)+1)/2);

        System.out.printf("%.3f",y);
    }
}
