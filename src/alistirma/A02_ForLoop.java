package alistirma;

public class A02_ForLoop {
    public static void main(String[] args) {

         /*
        Soru 1 ) 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

            bu soru day18  C05 Class in da  doWhile ile cozuldu
         */

        int bas=9;
        int bitis=190;
        int toplam=0;
        for (int i = bas; i <=bitis ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
                toplam+=i;  //    ekstra toplami denemek icin yaptim
            }

        }

       System.out.println("toplam :"+toplam);
    }
}
