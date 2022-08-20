package day11_stringManipulations;

public class C01_İndexOf {
    public static void main(String[] args) {


        String str ="Java ogrenmek cok guzel";

         /* Verilen bir String'de herhangi bir String veya char'in
           ilk kullanildigi index'i bize dondurur
         */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("r")); // 7
        System.out.println(str.indexOf("j"));// -1 ---> cunku bastaki buyuk J oldugundan yok der

        System.out.println(str.indexOf("mek")); // 10 olarak yazar cunku kelimedede ılk harfin index i doner

        // eger istediginiz index den sonrasini kontrol etmek istersek
        // o zaman ayni method u iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",(6+1))); // yazilan index ten baslar o yuzden ikinci g yi bulmak icin 6+1 den baslariz


        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var

        int ilk_e=str.indexOf("e");
        int ikinci_e=str.indexOf("e",(ilk_e+1));

        if (ikinci_e==-1){
            System.out.println("verilen str de ikinci e yoktur ");
        }else {

            int ucuncu_e=str.indexOf("e",ikinci_e+1);

            if (ucuncu_e==-1){
                System.out.println("verilen str da ucuncu e yoktur");
            }else {
                System.out.println("verilen str daki 3.e 'nin index i :"+ucuncu_e);
            }
        }

    }
}
