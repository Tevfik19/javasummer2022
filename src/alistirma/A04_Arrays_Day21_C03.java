package alistirma;

import java.util.Scanner;

public class A04_Arrays_Day21_C03 {
    public static void main(String[] args) {



        // Soru 3- Kullanicidan aldiginiz  bir ismin , verilen  array’de  olup olmadigini  kontrol edip,
        //  bize true veya false sonucu donen bir method olusturun.

        String [] isimler= {"Basak", "Nurullah", "Fatih","Adem","Enes"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=scan.nextLine();

        boolean sonuc=contains(isimler,arananIsim);

        if (sonuc){
            System.out.println("GİRİLEN İSİM VAR");
        }else {
            System.out.println("girilen isim yok");
        }
    }

    private static boolean contains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {
            if (arananIsim.equalsIgnoreCase(isimler[i])){
                sonucMethod=true;

            }

        }

        if (sonucMethod){
            System.out.println("GİRİLEN İSİM VAR");
        }else {
            System.out.println("girilen isim yok");
        }



        return sonucMethod;
    }
}
