package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        Collections < dataTuru > nu object secmeniz durumunda Collection a
        farkli data turlerinden objeler koymaniza izin verir
        Bu depolama acısından bize esneklik saglar.
        Ancak islem yaparken tum objeleri object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir.
         */

        List<String>list=new ArrayList<>();
        //list.add(5); int eklenemez
        //list.add('s'); char eklenemez
        //list.add(true); boolean eklenez cuntu String tanimlanmis

        List<Object>list1=new ArrayList<>();
        list1.add(5);
        list1.add('s');
        list1.add(true);
        list1.add("Ali");
        System.out.println(list1);//[5, s, true, Ali]

        // Collections ozelliginden Object yazdik hepsini attık
        // islem yapmak zorlasir

        list1.set(0,(Integer)list1.get(0)+5);

        System.out.println(list1);//[10, s, true, Ali]

        list1.set(3,list1.get(3)+"Can");

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
        System.out.println(set1);//[5, 5, true]
    }
}
