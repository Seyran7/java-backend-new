package Turing;

import java.util.Scanner;

public class HowMuchTimeHappened {

    public static void main (String[]args){

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir reqem daxil edin:");
        int n =scan.nextInt();

        if(n>0&&n<=2*Math.pow(10,9)){
            System.out.println("Daxil edilen eded serte uygundur: ");
        }
        System.out.println("Emeliyyat icra olunur:");

        int counter=0;

        while(n>0){
            int sum=0;
            int temp=n;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            n-=sum;
            counter++;
        }
        System.out.println(counter + " defe icra olundu");
    }
}
