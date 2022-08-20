package day37_overridding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*

         */

    }

    @Override
    void motor() {

        /*
         @Override notasyonu Javaya bir gorev verir
         Java, bu notasyonla birbirine bagli olan iki method u
         surekli kontrol eder

         */

        System.out.println();
    }
}
