package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String> ll1 =new LinkedList<>();

        List<String> ll2= new LinkedList<>();

        Queue<String>ll3=new LinkedList<>();

        Deque<String>ll4=new LinkedList<>();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);//[Berk, Done, Enes, Ayse]

        System.out.println(ll2.remove(3));//ayse hem sildi hemde sildigini getirdi
        //eger listemiz Integer elementlerden olusuyorsa direk sayi yazarsak indek olarak kabul eder
        //bir variable a atama yapar ve remove da o variable in ismini yazarsak obje olarak kabul eder
        System.out.println(ll2.remove("Kemal"));//false cunku kemal yok
        System.out.println(ll2.isEmpty());//false

        System.out.println(ll2.set(1, "Serap"));//Done // Serap ile degistirdi. degistirdigini de getirdi
        System.out.println(ll2);//[Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);//[Berk, Ismail]
        ll2.retainAll(ll1);// ll2 deki tum elementleri ll1 ile karsilastirir.ll1 de olmayanlari siler
        System.out.println(ll2);//[Berk]

        System.out.println(ll2.hashCode());//2066939 hash kodu uretir
    }
}
