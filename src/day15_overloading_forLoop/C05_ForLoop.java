package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar(5 dahil) olan tam sayiları toplayalım
        int toplam=0;

        for (int i = 1; i <= 5; i++) {

            toplam+=i;
        }
        System.out.println("sayilarin toplami :"+toplam);

        //10 dahil - 20 dahil arasındaki sayilari toplayin
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("10-20 arası sayiların toplami :"+toplam);

        // 30 ile 50 arasi cift sayilarin toplayin

        // 1. yöntem
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("30 ile 50 arasi cift sayilarin toplami :"+toplam);

        // 2. yöntem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }
            System.out.println("30 ile 50 arasi cift sayilarin toplami :"+toplam);
        // 1500 ile 1600(sinirlari dahil) arasında 7 ile bolunebilen sayilari topla
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if(i%7==0){
                toplam+=i;
            }

        }
        System.out.println("1500 ile 1600(sinirlari dahil) arasında 7 ile bolunebilen sayilari toplami"+toplam);





    }

}
