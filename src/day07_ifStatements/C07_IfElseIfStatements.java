package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        bir onceki soruda ,kullanıcı negatif deger girerse uyaralım
        NOT :Birden fazla if-else if birbirine baglanmissa
        son durum onemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas =scan.nextDouble();

        if (yas<0){
            System.out.println("Lutfen gecerli bir yas giriniz ");

        } else if (yas<65) {
            System.out.println("emekli olamazsin"+(65-yas)+" calismalisin ");

        }else {
            System.out.println("Emekli olabilirsiniz");
        }
    }
}
