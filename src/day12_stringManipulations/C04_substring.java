package day12_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str ="Java cok yasa ";

        System.out.println(str.substring(3,4));//( a )  olur kac karakter alacagini
                                              // degerlerin farkindan anlariz 4-3 =1 karakter

        System.out.println(str.substring(5,7));// 7-5 iki karakter yani ( co ) yazdirir

        System.out.println(str.substring(6,6));// 6-6 =0 oldugundan sonuc hıclik olur ""

         // System.out.println(str.substring(6,2));// exception hatali calisir

        }
}
