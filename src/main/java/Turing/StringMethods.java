package Turing;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metn daxil edin:");
        String metn =scan.nextLine();

        //This code will replace all characters  with space and nothing which is not letter in entering text

       metn=metn.replaceAll("\\d","");
       metn=metn.replaceAll("\\s","1");
       metn=metn.replaceAll("\\W","");
       metn=metn.replaceAll("\\d"," ");
       metn=metn.replaceAll("_","");


        System.out.println("Deyisdirilmis metn:"+"\n"+metn);

    }
}
