package day12_stringManipulations;

public class C01_Replace {
    public static void main(String[] args) {


        String str =" Bu gun ha va cok guz el ";

        System.out.println(str.replace(" ","")); // bosluk yerine hiclik koyduk
                                                                  // Bugunhavacokguzel   olur

        // hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));


        //guz el yerıne harika yazalim
        System.out.println(str.replace("guz el","harika"));


        // cumleyi replace kullanarak Bugun Java cok guzel

        str=str.replace("Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");

        System.out.println(str);

    }
}
