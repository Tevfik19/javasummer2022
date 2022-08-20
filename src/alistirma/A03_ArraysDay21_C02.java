package alistirma;

public class A03_ArraysDay21_C02 {
    public static void main(String[] args) {

        // Soru 2- Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler ={"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        enUzunVeEnKisayiYazdir(isimler);
    }

   public static void enUzunVeEnKisayiYazdir(String[] isimler) {

       String enUzunKelime = isimler[0];// en uzunu bulmak icn yine array de bulunan bir degeriatadim
       // diger isimlerle kiyaslama yapabilmek icin
       String enKisaKelime = isimler[0];// ayni islemi en kisa icinde yaptik

       for (int i = 1; i < isimler.length; i++) {

           if (enUzunKelime.length() < isimler[i].length()) {

               enUzunKelime = isimler[i];
           }
           // burda en uzun ve en kisa birbirinden bagimsiz oldugundan ayri if blogu kullandik
           if (enKisaKelime.length() > isimler[i].length()) {

               enKisaKelime = isimler[i];


           }
       }

       System.out.println("Array deki en uzun kelime :"+enUzunKelime
               +"\nArray deki en uzun kelime  :"+enKisaKelime);

   }
}
