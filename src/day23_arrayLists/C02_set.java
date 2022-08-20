package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

           /*
          elimizde urunlerin bulundugu bir liste var
          urun listesindeki istenen siradaki urunu
          istegimiz yeni urunle degistirip
           eski urunu, varolan eski urunler listesine ekleyelim
         */
        List<String>urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String>eskiUrunler=new ArrayList<>();
        // listedeki ikrram in yerine biskrem koyalim
        // ikrami da eski urunler listesine ekleyelim


        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);// silinecek urunun listede kacinci index de oldugunu bulduk
                                        // ve index oldugu icin int bir variiable atadik
        String silinenUrun= urunler.set(temp,yeniUrun);// yeni urunu silinen urunun index ine koyduk
        // ayni satirda yazdirma veya deger atama yaparsak silinen urunede ulasiriz

        eskiUrunler.add(silinenUrun);// silinen urunude eski urun listesine ekledik

        System.out.println("urunler listesi  :"+urunler);
        System.out.println("eski urunler listesi  :"+eskiUrunler);


        yeniUrun="Kahve";
       silinecekUrun="Cay";

         temp=urunler.indexOf(silinecekUrun);
         silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi  :"+urunler);
        System.out.println("eski urunler listesi  :"+eskiUrunler);


        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi  :"+urunler);
        System.out.println("eski urunler listesi  :"+eskiUrunler);








    }
}
