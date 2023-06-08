package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String>ll3=new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        //Queue kuyruk demektir, sira onemlidir.
        //gelen sona gelir, giden bastan gider

        System.out.println(ll3);//[Adem, Zeynep, Hpolat, Kadir]
        System.out.println(ll3.remove());//Adem ,  silinen (giden) ilk bastaki
        System.out.println(ll3);//[Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat"));//true sildim diyor
        System.out.println(ll3);//[Zeynep, Kadir]

        System.out.println(ll3.element());//Zeynep
        System.out.println(ll3.peek());//Zeynep

        Queue<String>ll4=new LinkedList();
        //System.out.println(ll4.element());//throws exception ,NoSuchElementException
        System.out.println(ll4.peek());//null

        //peek ve element silmeden ilk elementi bize döndürür.Aralarinda ki fark
        //bos liste olursa peek null doner,element exception firlatir.

        ll3.offer("Ahmet");
        System.out.println(ll3);//[Zeynep, Kadir, Ahmet] sona ekledi

        ll3.offer("Sefa");
        System.out.println(ll3);//[Zeynep, Kadir, Ahmet, Sefa] sona ekledi

        System.out.println(ll3.poll());//Zeynep bastakini hem siler hem getirir
        System.out.println(ll3);//[Kadir, Ahmet, Sefa]

        //System.out.println(ll4.remove());// exception bosu nasil silecem diye

        System.out.println(ll4.poll());//null
    }
}
