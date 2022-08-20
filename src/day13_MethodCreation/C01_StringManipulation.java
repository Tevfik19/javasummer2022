package day13_MethodCreation;

public class C01_StringManipulation {

    /*
Soru 2-) String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz.
-String str1 = "$13.99"
-String str2 = "$10.55"
ipucu= Double.parseDouble() metodunu kullanabilirsiniz.
 */
    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

       str1=str1.replaceAll("\\D","");
       double sayi1=Double.parseDouble(str1);
        System.out.println(sayi1);



       str2=str2.replaceAll("\\D","");
       double sayi2=Double.parseDouble(str2);
        System.out.println(sayi2);

       System.out.println("$"+(sayi1+sayi2)/100);// sayilarin noktalar gittigi icin tekrar 100 e bolduk

       // ikinci yol
      /*
        String strİlk=str1.substring(0,1).replaceAll("\\D","");
        String strKalan=str1.substring(1);

        System.out.println(strKalan);
        double sayi1=Double.parseDouble(strKalan);
        System.out.println(sayi1);

        String str2İlk=str2.substring(0,1).replaceAll("\\D","");
        String str2Kalan =str2.substring(1);
        double sayi2=Double.parseDouble(str2Kalan);
        System.out.println(sayi2);
        System.out.println("$"+(sayi1+sayi2));
     */


    }





}
