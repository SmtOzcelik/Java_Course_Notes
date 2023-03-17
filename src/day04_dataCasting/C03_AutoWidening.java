package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        byte sayi1=23;
        short sayi2=55;
        int sayi3=sayi1+sayi2;// 58
        double sayi4=sayi1*sayi2;//1265.0

        sayi4=sayi2/sayi1;// normalde 2.391 çıkar fakat sayılar int byte ta
                            //tam sayı olduğu için sonuç 2

        sayi4=(double) sayi1/sayi2; // sayi1 double çevirilince 2.391 olur.
                                     //58.0/23 = 2.391



    }
}
