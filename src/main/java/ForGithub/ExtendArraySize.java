package ForGithub;

import java.util.Arrays;
import java.util.Scanner;

public class ExtendArraySize {
    public static void main(String[] args) {

        //input
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number for array's size:");
            int size = scan.nextInt();
            int[] array = new int[size];


            //proses this code will increase current array's size by one unit
            System.out.println("Enter " + size + " number:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }

            int[] changedArray = new int[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                changedArray[i] = array[i];
            }
            System.out.println("Enter a  number for new array's last index:");

            changedArray[array.length] = scan.nextInt();

            System.out.println(Arrays.toString(changedArray));

        }

    }
}

