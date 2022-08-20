package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        // 10 ile 30 arasindaki (10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin


        for (int i = 10; i <=30 ; i++) {  // bu sekilde sonuna da virgul kor
            System.out.print(i+",");

        }
        System.out.println(""); // ustteki sout ile alttaki karimasin diye araya bos sout yazdik
       // sondaki virgulden kurtulmak icin
        int bas =10;
        int son=30;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }

        }
    }
}
