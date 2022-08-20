package practice1;

import java.sql.SQLOutput;

public class Q04_JavaVariable {
    public static void main(String[] args) {


    // Initializing Variable  //variable baslangic degeri verme

    int yas =33;
    double boy=1.70;
        System.out.println("yas :"+yas);
        System.out.println("boy = " + boy);




// To copy the variable's value

    int yasim =32;
    int enesyas =yasim;
        System.out.println("enesyas = " + enesyas);
        System.out.println("yasim = " + yasim);

// you can declare multiple variables in the same line
    int yil =2022, ay=6, gun=20;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);

// updating a variable (yeni atanan deger)

        yil=2032;

        System.out.println("update yil :"+yil);


//Bir degisken tanimlayin : x
//Baska bir degiskeni initialize edin : y
//x degiskenini initialize edin
//y degiskenini yeni bir degerle guncelleyin

        int x;      // deklarasyon
        int y=2000; //initialize-asingment
        x=30;     //x in initialize
        y=1;   // guncelleme

        System.out.println("y = " + y);
        System.out.println("x = " + x);





}}

