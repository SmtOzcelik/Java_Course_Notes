package day18_while_dowhileloop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

    /*
    while loop da once kontrol edip sonra islem yaptığımız için
    islem bittikten sonra loop un kirilmasi icin bir kez daha dönmemiz gerikiyor.
    */

        int sayi=7;

        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }

        /* do while loop ile calistigimizda bu dezavantaj ortadan kalkar.*/

        sayi=7;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);
    }

}
