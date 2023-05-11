package day28_statickBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indimli fiyati hesaplayip bize donduren bir method olusturun
         */

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat"+indirimliFiyat);//75.00
    }

    public static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) {

        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}
