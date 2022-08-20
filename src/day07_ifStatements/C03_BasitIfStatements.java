package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
         /*
         bir if statement'da "{}"kullanılmazsa

        java ilk satırı sart ile baglar ,sonraki satirlar bagımsız olur

        eger birden fazla satir ayni if sartina baglanmıs ise mutlaka"{}" kullanmalıyız
          */


        int sayi=-23;

        if (sayi>0)
            System.out.println("sayi pozitif"); // degere baglı calısır
            System.out.println("pozitif kalacaktir");// her zaman  calısır

        if (sayi%2==0)
            System.out.println("sayi cift");// degere baglı calısır
            System.out.println("cift kalcaktir");//her zaman  calısır

        if (sayi%5==0)
            System.out.println("sayi 5'in tam kati"); // degere baglı calısır

    }
}
