package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfstatements {
    public static void main(String[] args) {

        /*
       soru 3-  Kullanicidan  gun ismini alin ve harftaici veya hafta sonu oldugunu yazdirin
        ORN:gun=Pazar outpput="Hafta sonu"
        ORN:gun=Sali outpput="Hafta ici"
        **String icin equals method'unu kullanin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();
        System.out.println("girilen gun :"+girilenGun);
        // toLowerCase girmemizin sebebi kullanıcı buyuk de gırse kucuk de
        //tum harfleri kucuk yazdırır orn:  Pazar ,PAzar,PaZaR,da girse pazar yazdırır
       if (girilenGun.equals("pazar")||girilenGun.equals("cumartesi")){
           System.out.println("Girilen gun HAFTASONU");

       }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                ||girilenGun.equals("carsamba")|| girilenGun.equals("persembe")
                ||girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }
      if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
              ||girilenGun.equals("carsamba")|| girilenGun.equals("persembe")
              ||girilenGun.equals("cuma")||girilenGun.equals("pazar")||girilenGun.equals("cumartesi"))) {

          System.out.println("Lutfen gecerli bir gun ismi giriniz");
      }
      }


}
