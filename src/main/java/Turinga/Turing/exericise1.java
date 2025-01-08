package Turinga.Turing;

import java.util.Scanner;

public class exericise1 {
    public static void main(String[] args) {

        System.out.println("Daxil edilen eded tek, yoxsa cutdur?:");

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir eded daxil edin:");

            int arraySize = scan.nextInt();
            int[] ededler = new int[arraySize];



            System.out.println(arraySize + " eded daxil edin:");


            for (int i = 0; i < ededler.length; i++) {
                ededler[i] = scan.nextInt();
            }

        for (int num : ededler) {
            myMethod(num);
        }

        }
    }

    public static void myMethod(int a) {
        if (a % 2 == 0) {
            System.out.println("Eded " + a + " cutdur.");
        } else {
            System.out.println("Eded " + a + " tekdir.");


        }
    }
}





