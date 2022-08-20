package day12_stringManipulations;

public class C03_subString {
    public static void main(String[] args) {

        String isim ="Suleyman ";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3));// index 3 den baslayarak kalani yazdirir
                                                        // eyman
        System.out.println(soyisim.substring(soyisim.length()-3));// son uc haneyi alir  (fil)

        System.out.println(isim.substring(2,4));// ilk sayinin indexi dahil son index dahil degil (le)

        // isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        // kredi kartinin ilk 4 rakami gorunsun geriye kalan *

        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar =soyisim.substring(1).replaceAll("\\w","*");
        String kkIlk4=kartNo.substring(0,4); // burda index 0 dan basladigi icin ilk rakam 0. inci index olur
                                             // 4. index de dahil degil bu sekilde ilk 4 rakami alir

        String kkGeriyeKalanlar=" **** **** ****";// kredi kartinin kalan rakamlar sabit oldugundan
                                                 //  substring le ugrasmadan direk * atamasi yaptik

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "
                +soyisimIlkHarf+soyisimGeriyeKalanlar
                +"\n"+kkIlk4+kkGeriyeKalanlar);
    }

}
