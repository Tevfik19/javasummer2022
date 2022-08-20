package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {


        /*

        Wrapper class javanın hazır methodlarini kullanabilmemiz için
        primitive data turlerinin her biri icin actıgı class'lardır

        int....>Integer
        char....>Character
        digerleri primitive data turu ile ayni sadece  baş harfi buyuk
         */
        String str ="java ile hayat ne guzel";

        System.out.println(str.toUpperCase());



        boolean guzelMi=true;
        //  guzelmi  boolean primitive oldugundan hazır method'u bulunmuyor

        Boolean BuGuzelMi=true;

        BuGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);  //-32768
        System.out.println(Short.MAX_VALUE); //32767


        String ogrNo="123456";

        // kullanıcıdan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı bir sifre giriniz ");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlası :"+sifre);
        System.out.println("Integer girilen sifrenin 3 fazlası :"+sifreSayi);

        /*
        Wrapper class'lar ilerde kullanabilecegimiz pek çok faydalı hazır method icerir

         */








    }
}
