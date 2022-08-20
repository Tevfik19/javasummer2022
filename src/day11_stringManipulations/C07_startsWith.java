package day11_stringManipulations;

public class C07_startsWith {
    public static void main(String[] args) {

        String input ="Java gun gectikce guzellesiyor";


        System.out.println(input.startsWith("J"));//TRUE

        System.out.println(input.startsWith("")); // true

        System.out.println(input.startsWith("gun",5));// 5.inci index ve sonrasi gun ilemi basliyor onu kontrol eder
    }

}
