package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

       System.out.println(str.charAt(0));// ılk harfi yazdirir "j"

       System.out.println(str.toUpperCase().charAt(7));// "R"

       System.out.println(str.charAt(21));// "l"

       //  System.out.println(str.charAt(22));   // StringIndexOutOfBoundsException
    } // son harfin uzunlugunu bulmak ıcın str in uzunlugunun bir eksigini gireriz
     // eger index olarak uzunlugu veya daha buyuk bir sayi girersek java exception verir


    // charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
    // String method larindan kullanmamiz gereken bir method varsa
    // charAt() den once kullanmaliyiz

}