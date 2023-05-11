package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        String[]arr={"ismail","nurullah","fatih"};
        /*
        Uzun listeler oluşturmamız gerektiginde tek tek eklemek yerine array
        oluşturup,bunlari list e cevirmek daha pratik olabilir.
        1-Loop ile array deki tum elementleri list e atabilir.
        2-Arrays.asList() kullanilabilir
        ancak bu methodun 2 tane kotu yan etkisi var
        -Array class i kullanildiği icin array özellikleri gecerli olur
         dolayisiyla list te olan add,remave gibi size i degiştiren methodlar 
         bu sekilde oluşturulan list lerde kullanilamaz.
        - kaynak olan array ile urun olan list özleştirilir. birinde yapilan
        degişiklik,otomatik olarak diğerine de işlenir.
        */


        List<String>sinifList= Arrays.asList(arr);
        System.out.println(sinifList);////[ismail, nurullah, fatih]

        //1. yan etki
        //sinifList.add("erdi"); ekleme yapamadik hata verdi o yuzden tercih edilmez
        //sinifList.remove(1);  cıkarma islemi de yapamadik hata var

        //2.yan etki
        arr[1]="emre";
        System.out.println("değişim sonrasi array : "+Arrays.toString(arr));//[ismail, emre, fatih]
        System.out.println("arr i değişince list : "+sinifList);//[ismail, emre, fatih]
        // arr yi değiştirince list in değişmemesi gerekir

        sinifList.set(0,"utku");
        System.out.println("list i degistirince list : "+sinifList);//[utku, emre, fatih]
        System.out.println("list i degistirince array : "+Arrays.toString(arr));//[utku, emre, fatih]
        // list değisince arr değismemesi gerekir.

         
    }
}
