package day15_overloading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {

        topla(4,5);//9

        topla(5.2,3); // hangi data turu uygunsa sadece o method turu  calısır

        topla(3.4,6.1);
        topla(5,6.2);

    }

    /*
    Java hangi method un calisacagina karar verirken optimizasyon yapar
    -eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
    -eger cast yapmadan kullanacagi bir method yoksa , en az cast yaparak kullanabilecegi
     method u tercih eder
     */
    public static void topla(int sayi1,int sayi2){

        System.out.println("iki integer in toplami :"+(sayi1+sayi2));
    }


    public static void topla(double sayi1,int sayi2) {

        System.out.println("bir double bir ve bir   integer in toplami :" + (sayi1 + sayi2));
    }



    public static void topla(double sayi1,double sayi2) {

        System.out.println("iki double in toplami :" + (sayi1 + sayi2));
    }
}
