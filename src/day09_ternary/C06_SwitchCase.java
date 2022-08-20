package day09_ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /*
        kullanicidan gun ismini alin (bu soruda kullanicidan almadik variable atadik )
        hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input="pazar";
        input=input.toLowerCase();


        switch(input){
            case "pazartesi":
                System.out.println("hafta ici");
                break;
            case "sali" :
                System.out.println("hafta ici");
                break;
            case "carsamba":
                System.out.println("hafta ici");
                break;
            case "persembe":
                System.out.println("hafta ici");
                break;
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default :
                System.out.println("lutfen gecerli bir gun giriniz");

        }
            // aynı sonuclar icin birkez yazdirmak yeterli olur aralardan break lari kaldiriz


        switch(input){
                case "pazartesi":
                case "sali" :
                case "carsamba":
                case "persembe":
                case "cuma":
                    System.out.println("hafta ici ");
                    break;

            case "cumartesi":
                case "pazar":
                System.out.println("hafta sonu");
                break;
            default :
                System.out.println("lutfen gecerli bir gun giriniz");

        }
    }
}
