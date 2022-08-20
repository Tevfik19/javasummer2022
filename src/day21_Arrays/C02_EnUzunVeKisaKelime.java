package day21_Arrays;

public class C02_EnUzunVeKisaKelime {


    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun
        String[] isimler ={"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};
        enUzunVeKisayiYazdir(isimler);
    }
    public static void enUzunVeKisayiYazdir(String[] isimler) {
        String enUzunKelime= isimler[0];// en uzunu bulmak icn yine array de bulunan bir degeriatadim
        // diger isimlerle kiyaslama yapabilmek icin
        String enKisaKelime= isimler[0];// ayni islemi en kisa icinde yaptik
        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length()>=enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            // burda en uzun ve en kisa birbirinden bagimsiz oldugundan ayri if blogu kullandik
            if (isimler[i].length()< enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }
        System.out.println("Arraydeki en uzun kelime : " + enUzunKelime);
        System.out.println("Arraydeki en kisa kelime : " + enKisaKelime);
    }
}

