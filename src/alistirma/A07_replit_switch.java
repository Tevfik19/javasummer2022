package alistirma;

import java.util.Scanner;

public class A07_replit_switch {
    public static void main(String[] args) {

    /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

                IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)


        BMI 18,5'in altındaysa zayıfsınız

        BMI 18,5 ile 25 arasında ise kilonuz idealdir

        BMI 25-30 arasındaysa şişmansınız

        BMI 30'dan büyük veya eşitse, obez


        Input:

        Output:

        Agirlik : 71

        Boy : 1,72

        BMI : 23.99945916711736

        Zayifsiniz.

     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boy girin (cm) ");
        double boy=scan.nextDouble();
        System.out.println("Lutfen kilo girin");
        double kilo=scan.nextDouble();

        double bmi=kilo/(boy/100*boy/100);
        System.out.println("BMI :"+bmi);

        if (bmi<18.5) {
            System.out.println("zayıfsınız");
        } else if (bmi<25) {
            System.out.println(" kilonuz idealdir");

        } else if (bmi<30) {
            System.out.println(" şişmansınız");

        }else System.out.println("obez");


    }



    }

