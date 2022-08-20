package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {



        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


      Boolean sonuc=  urunler.contains("Nutella");// true
        System.out.println(sonuc);

        //VEYA DİREK YAZDİRALİM
        System.out.println( urunler.contains("Nutella"));// true
        System.out.println(urunler.contains("Hobby"));// false


        List<String> urunler2=new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        System.out.println(urunler.containsAll(urunler2));// true     urunllerde urunler2 listesinin tamami varsa true doner
        urunler2.add("Hobby");

        System.out.println(urunler.containsAll(urunler2));// false  listenin tamami yoksa false











    }
}
