package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodile {

    public static void main(String[] args) {

       Map<Integer,String> ogrenciMap = ReusabelMethods.mapOlustur();

        System.out.println(ogrenciMap);

        // value lari sira numarali olarak yazdirin

        ReusabelMethods.tumValueSiraliYazdir(ogrenciMap);

        // isim ve soyisimlerin birlikte olacagi bir liste olusturun

        List<String> sinifisimsoyisimList=ReusabelMethods.isimSoyisimListesiOlustur(ogrenciMap);

        System.out.println("isim soyisim listesi :"+sinifisimsoyisimList);

        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin


    }
}
