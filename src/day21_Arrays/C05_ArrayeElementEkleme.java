package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        //Soru-5 )  Verilen bir array e yeni bir element ekleyen method olusturun
        
           String[]sinifListesi={"Ali Can","Nida Yucedal","Musa Yaman"};//once eski listemizi olusturduk
        String eklenecekIsim="Murat Babayigit";
        
        sinifListesi=elamanEkle(sinifListesi,eklenecekIsim);// eklenecek elementi bana dondurmesi lazim

        System.out.println(Arrays.toString(sinifListesi));
        
           
    }

   public static String[] elamanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[]yeniSinifListesi=new String[sinifListesi.length+1];// basta [null,null,null,null]
       //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum

       for (int i = 0; i <sinifListesi.length ; i++) {
           yeniSinifListesi[i]=sinifListesi[i];
         //eski listedeki tum elemanlari , yeni listeye tasidim
       }

       // son index e ise eklenecek ismi atadim
       yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
       
       return yeniSinifListesi;
    }
}
