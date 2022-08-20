package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1=new Ogretmen();

        System.out.println("Ogretmen1 :"+ogretmen1);


        Ogretmen ogretmen2=new Ogretmen("Tevfik","Aykac","10/05/1990","Fenbilgisi",
                "Matematik");

        System.out.println("Ogretmen2 :"+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Fatma","Sahan","25/07/2022");

        System.out.println("Ogretmen3 :"+ogretmen3);

} }
