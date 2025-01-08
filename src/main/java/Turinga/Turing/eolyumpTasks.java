package Turinga.Turing;

public class eolyumpTasks {
    public static void main(String[]args){
        isimYaz();
        isimYazdir("Akif","Islamzade");
        String name=Isim( "Azer");
        System.out.println(name);

    }
    public static void isimYazdir(String ad,String soyad){
        //String sonuc= "Ad: "+ ad +"\n"+"Soyad: "+soyad;
        System.out.println("Ad: "+ad+"\n"+"Soyad: "+ soyad);
    }

    public static String Isim(String a){
        return a ;
    }




    public static void isimYaz(){
        System.out.println("isim:"+ "Akif");
    }
}
