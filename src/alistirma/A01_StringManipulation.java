package alistirma;

import java.util.Scanner;

public class A01_StringManipulation {

    public static void main(String[] args) {


    // kullanicidan isim al ilk harfi buyuk olarak yazdir


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isim girin");

        String isim=scan.next().toUpperCase();
      //  char isimİlkHarf=isim.charAt(0);
//
      //  String isimGeriyeKln=isim.substring(1).toLowerCase();
      //  System.out.println("isim  :"+isimİlkHarf+isimGeriyeKln);


        // İKİNCİ YOL

       isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println("isim :"+isim);
    }
}
