package day21_Arrays;

public class C02_EnuzunveenkisaKelime {
    public static void main(String[] args) {

        // verilen String deki bir arrayde en uzun ve en kisa kelimeleri yazdıran method oluştur.
        // kelimeleri buyuk harf ile yazdırın

        String[] isimler={"erdal","onur","mehmet","hayrullah","mihrican"};

        enUzunVeenKisayiYazdir(isimler);
    }

    public static void enUzunVeenKisayiYazdir(String[] isimler) {

        String enuzunkelime=isimler[0];
        String enkisakelime=isimler[0];

        for (int i = 1; i <isimler.length ; i++) {
            if (enuzunkelime.length()<isimler[i].length()){
                enuzunkelime=isimler[i];
            }

        }
        System.out.println("en uzun kelime : "+enuzunkelime.toUpperCase());

        for (int i = 1; i < isimler.length ; i++) {
            for (int j = 1; j <isimler.length ; j++) {
                if (enkisakelime.length()>isimler[j].length()){
                    enkisakelime=isimler[j];
                }
            }
        }System.out.println("en kisa kelime : "+enkisakelime.toUpperCase());

    }
}
