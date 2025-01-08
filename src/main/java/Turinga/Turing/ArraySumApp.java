package Turinga.Turing;

import java.util.Scanner;

public class ArraySumApp {

    public static void main(String[]args){

        while(true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number for array's size:");

            int size = scan.nextInt();

            int[] array = new int[size];

            System.out.println("Enter numbers for to fill in the array:");

            int sum=0;

            for( int i = 0; i<array.length;i++){
               array[i]=scan.nextInt();
                sum+=array[i];
            }
            System.out.println(sum);
        }
    }
}
