package practice_Recap1;

import java.util.Scanner;

public class Q02_YolHizZaman {
    public static void main(String[] args) {
        
        
        /*
        Problem tanima
        Mesafeyi ve hiz i alip sureyi hesaplayan bir kod yaziniz
        Ornegin : İstanbul ile Ankara arasi 400km olarak olculmektedir. bu yoluortalama 
        120 km/saat hizla giden bir arac ne kadar surede hedefe varir?
        
        ornek ekran cıktisi 
        mesafeyi giriniz : 400
        hizi giriniz :100
        sure 4 saattir. 
         */
        
        Scanner scan =new Scanner(System.in);
        System.out.println("mesafeyi giriniz");
        double mesafe=scan.nextDouble();
        System.out.println(" hizi giriniz");
        double hiz=scan.nextDouble();
        double sure =mesafe/hiz;
        System.out.println("sure = " + sure);
        
    }
}
