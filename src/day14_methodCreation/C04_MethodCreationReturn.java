package day14_methodCreation;

public class C04_MethodCreationReturn {


    // input olarak verilen isim ve soyismi
    // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
    // bize bu halini donduren bir method olusturun
    // NOT: programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

    public static void main(String[] args) {

        String isim="enes";
        String soyisim="bozkurt";


        String gizliIsim= ismiGizle(isim,soyisim);

        System.out.println(gizliIsim);
        System.out.println(isim+" "+soyisim);
    }

    private static String ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;
    }
}
