package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        java da olusturdugumuz methodlarin isminin yaptigi islev ile uyumlu olmasini isteriz

        mesela bir String in bir bolumunu almak icin java
        2 adet substrıng() method u veya
        Verilen String deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace () method u var

        java ayni isimde birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi ve
        parametrelerin data turune gore karar verir.

         */

        String str="Bu Java ogrenilecek baska yolu yok  ";

        str.substring(2);
        str.substring(2,4);
        str.replace('c','v');
        str.replace("J","H");
       // str.replace(5,8) bu olmaz replace belli data turlerinde calisir

        /*
        Ayni isimde ama farkli method lari olusturmak icin
        degistirebilecegimiz seyler
        1-paremetre sayisi
        2-ayni sayida paremetreye sahip olsa bile , parametrelerin data turleri
        3-ayni sayida ve ayni data turunde parametreleri olan methodlarda
        parametrelerin siralanisi

         */
    }
}
