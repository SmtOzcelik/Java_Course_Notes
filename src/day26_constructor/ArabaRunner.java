package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        // Bir gun onceki Car class indan obje olusturalim.
        /*
        Farkli bir class dan obje olusturdugumuzda access modifier lari da dikkate almaliyiz.
         */
        Car car1 = new Car();
        System.out.println(car1.fiyat);

       /*
       Araba class indan bir obje olusturdugumda eger default constructor kullanildiysa
       tum ozellikler icin tek tek atamak zorunda kaliriz.
        */

        Araba araba1=new Araba();
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("Araba1 bilgileri\nMarka : "+araba1.marka +
                "\nModel : " + araba1.model+
                "\nYil : "+araba1.yil+
                "\nFiyat :€"+araba1.fiyat);
        /*
        Eger bir obje yi olustururken bazi ozelliklerini argument belirtip
        o ozelliklerde bir obje olusturmak istersek java itiraz eder.
        Cunku her class da default construckter vardir o da parametresizdir.
        Bizim yeni ve parametreli construckter a ihtiyacımız var.
         */
        Araba araba2=new Araba("BMW","5.20",2011,15000);
        System.out.println("Araba2 bilgileri\nMarka : "+araba2.marka +
                "\nModel : " + araba2.model+
                "\nYil : "+araba2.yil+
                "\nFiyat :€"+araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println("Araba3 bilgileri\nMarka : "+araba3.marka +
                "\nModel : " + araba3.model+
                "\nYil : "+araba3.yil+
                "\nFiyat :€"+araba3.fiyat);



    }
}
