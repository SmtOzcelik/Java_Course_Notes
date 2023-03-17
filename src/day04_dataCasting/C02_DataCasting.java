package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;

        System.out.println(sayi1/sayi2);// sayılar int olduğundan cevapda int olur.
                                        // 4,6--- 4 olur.

        double sayi3 =5;
        System.out.println(sayi1/sayi3);//4,6 verir. ondalık çünkü double var
                                        // 2 farklı varible olduğunda hangisi kapsamlı ise o kubul edilir.

    }
}
