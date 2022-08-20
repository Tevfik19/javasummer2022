package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // soru 2) Kullanicidan bir harf isteyin
        // kucuk harf ise cosola "Kucuk Harf"
        // buyuk harf ise "Buyuk Harf"
        //  yoksa "Girdiginiz karakter harf degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin ");
        char harf=scan.next().charAt(0);


      /*
         String sonuc =(harf>='a' &&  harf<='z')?("Kucuk harf") :
                 (" buyuk harf veya gecersiz karekter ")
        */

        String sonuc =(harf>='a' &&  harf<='z')?("Kucuk harf") :
               ( (harf>='A' && harf<='Z')? "Buyuk Harf" :  "Girdiginiz karekter harf degil ");

        // parentezsiz de yazabiliriz
        String sonuc2 =harf>='a' &&  harf<='z'?"Kucuk harf" :
                harf>='A' && harf<='Z'? "Buyuk Harf" :  "Girdiginiz karekter harf degil ";

        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}
