package Turinga.Turing;

import java.util.Scanner;

public class createMatrisApp {
    public static void main(String[]args){
        //input
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a number:");

        int n=scan.nextInt();

        System.out.println("Enter a number:");

        int m=scan.nextInt();

        int[][]arrays=new int[n][m];

        int count =1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arrays[i][j]=count++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }

    }
}
