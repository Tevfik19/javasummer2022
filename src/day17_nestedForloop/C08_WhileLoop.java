package day17_nestedForloop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
  kullanicidan toplanmak uzere sayilar alin
  sayilarin toplami 500'u gecince(500 dahil)
  sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

  13 sayi girdinz ve toplamlari 567
 */
        int toplam =0;
        int sayi=0;
        int sayac=0; // sayaci 0 dan baslattik cunku while da once islem yapar sonra kontrol eder
        Scanner scan =new Scanner(System.in);


        while (toplam<500){

            System.out.println("Lutfen toplamak icin sayi girin ");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
           // System.out.println("toplam  :"+toplam); her girdigimiz sayinin toplamini da gorebiliriz

        }
        System.out.println(sayac+" sayi girdiniz ve toplamlari  :"+toplam);





    }
}
