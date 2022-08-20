package day11_stringManipulations;

public class C05_endsWİth {
    public static void main(String[] args) {

        String str="Ah be java";

        System.out.println(str.endsWith("ava"));// true

        System.out.println(str.endsWith("be java")); //true

        System.out.println(str.endsWith("Ah be java"));//true

        System.out.println(str.endsWith(""));//true hıclıkde true dondurur

        System.out.println("");

    }
}
