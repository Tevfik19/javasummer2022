package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {

    public static void main(String[] args) {

        /*
        kullanicidan gun alip 1 ise pazartesi,....
        7 ise pazar yazdiralim
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();

        /*
        switch yanina yazilan () neye gore deger atayacagimizi gosterir
        java girilen degere gore case 'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye veya switch parentezine kadar devam eder

        if -else if .......-else yapisinda oldugu gibi
        hic bir sarta uymayanlari default keyword kullaniriz
         */

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi ");
                 break;
            case 2 :
                System.out.println("Pazartesi ");
                break;
            case 3:
                System.out.println("Pazartesi ");
                break;
            case 4:
                System.out.println("Pazartesi ");
                break;
            case 5:
                System.out.println("Pazartesi ");
                 break;
            case 6:
                System.out.println("Pazartesi ");
                break;
            case 7:
                System.out.println("Pazartesi ");
                break;
            default:
                System.out.println("Gecerli gun no giriniz");

        }





    }
}
