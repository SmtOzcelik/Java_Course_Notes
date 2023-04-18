package day21_Arrays;

public class C01_MaxSayiyiBulma {
    public static void main(String[] args) {

        //verilen bir in array deki en buyuk sayiyi yazdıran bir method oluşturun.

        int[] sayilar={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);
    }

    private static void maxSayiyiYazdir(int[] sayilar) {
        int maxSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if (maxSayi<sayilar[i]){

                maxSayi=sayilar[i];

            }

        }
        System.out.println("Array deki en buyuk sayi : "+maxSayi);

    }
}
