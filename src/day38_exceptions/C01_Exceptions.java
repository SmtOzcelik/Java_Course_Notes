package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        Bir sorunla karsilasmayi beklediginiz noktalarda if else ile sorunu yakalayip
        onunla ilgili cozum uretebilirsiniz
        Ama sorunu her zaman if else ile cozemeyecegimizden jave try-catch block lari olusturmustur
         */

        int a=1000;
        int b=50;
        int sayac=1;
        while (sayac<100){
        // b=0 durumunda sistem exceptions vereceginden if else cozduk

            if(b==0){
                System.out.println("islem yapilirken payda 0 oldu,dikkat etmelisin");
            }else {
                System.out.println(a/b);
            }

            b--;
            sayac++;
        }

    }

}
