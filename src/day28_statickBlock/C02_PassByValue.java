package day28_statickBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));//90.0

        System.out.println(satisFiyati);//100.0

        System.out.println(indirimliFiyat(satisFiyati));//90.0

        /*
        iki farkli method da satisFiyati isminde variable olabilir.
        java buna itiraz etmez cunku scope lari farklidir.
         */

    }

    public static double indirimliFiyat(double orjinalFiyat){
        // methodumuz %10 indirip yapip yeni fiyati main methoda dondursun

        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati ;
    }
}
