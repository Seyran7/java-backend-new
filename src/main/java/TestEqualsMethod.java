import java.util.Scanner;

public class TestEqualsMethod {

    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Sifrenizi daxil edin:");
        String pswrd1=scan.nextLine();
        System.out.println("Sifrenizi yeniden daxil edin:");
        String pswrd2=scan.nextLine();

        if(pswrd1.equals(pswrd2)) {
            System.out.println("Sifre qebul edildi.");
        }
        if(!(pswrd1.equals(pswrd2))) {
              if  (pswrd1.equalsIgnoreCase(pswrd2)) {
                  System.out.println("Sifrenizi nezerden kecirin.");
              } else
                  System.out.println("Daxil edilen sifre uygun deyil.");
        }
    }
}

