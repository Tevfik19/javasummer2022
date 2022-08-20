package day26_constructor;

public class KamyonRunner {

    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();

        System.out.println("kamyon1 ozellikleri"+kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);

        System.out.println("kamyon2 ozellikleri"+kamyon2);// toString i yazmasakda kullaniyoruz

        Kamyon kamyon3=new Kamyon("MAN","as900",2007,400000);

        System.out.println("kamyon3 ozellikleri"+kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","s540");
           // toString kullanmadan yazdirirsak istedigimiz parametreleri yazabiliriz
        System.out.println("kamyon4 ozellikleri\nMarka "+kamyon4.marka+"\nModel "+kamyon4.model);
        System.out.println("kamyon4 ozellikleri "+kamyon4);// bu toString le yapilan





    }
}
