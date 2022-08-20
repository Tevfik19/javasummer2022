package day21_Arrays;

public class C01_Arrays_MaxSayiyiBulma {
    public static void main(String[] args) {

        // soru 1 - verilen bir int array deki en buyuk sayiyi yazdiran bir method olusturun

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }

   public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];// maxSayiya deger atamaliyiz bu deger sayilar array inden biri olursa
                               // isimiz daha kolay olur

       for (int i = 1; i <sayilar.length ; i++) { //0 inci index i atadigimizdan 1 den baslariz

           if (maxSayi<sayilar[i]){

             maxSayi= sayilar[i]; // maxSayiya en buyuk degerini bu sekilde atayabiliriz
           }

       }

       System.out.println("Arraydeki en buyuk sayi  :"+maxSayi);

    }

}
