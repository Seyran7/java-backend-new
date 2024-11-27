package Turing;

import java.util.Scanner;


public class coronaTestApp {
    public static void main(String[] args) {

        //input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a-b-c==2020) {
            System.out.println(a + "-" + b + "-" + c);
        }else if(a-b+c==2020) {
            System.out.println(a + "-" + b + "+" + c);
        }else if(a+b-c==2020) {
            System.out.println(a + "+" + b + "+" + "c");
        }else if(a+b+c==2020) {
            System.out.println(a + "+" + b + "+" + c);
        }else{
            System.out.println("Corona");

        }
    }
}

