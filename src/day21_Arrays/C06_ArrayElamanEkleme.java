package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayElamanEkleme {
    public static void main(String[] args) {

        //C05 deki metodu kullanarak array e eleman ekleyelim

        String[]takimlistesi={"suleyman","osman"};
        String eklenecekIsim="talha";

        // yeni isim tanimlamadik cunku takimlistesi hep ayni olur gelen giden olsa bile
        takimlistesi=C05_ArrayElementEkleme.elemanEkle(takimlistesi,eklenecekIsim);
        // takimlistesi=clas ismini yaz nokta koy metodu cagir
        // cagirdigin metodun yapisina göre verileri yerleştir caliştir
        System.out.println(Arrays.toString(takimlistesi));

    }
}
