package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        bir list olusturalim. 2 ayri method dan birinde sadece elemanlari degistirelim.

        digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim

        ve her 2 method call dan sonra kendi listimizi main method icerisinde kontrol edelim

         */

        List<String>list=new ArrayList<>();
        list.add("ali");
        list.add("veli");
        list.add("can");

        System.out.println("ilk basta list : "+list);//[ali,veli,can]

        elemanlaridegistir(list);

        System.out.println("eleman degistir methodundan sonra list :"+list);//[oguz,murat,fatih]

        listDegistir(list);

        System.out.println("list degistir methodunda sonra list : "+list);//[oguz,murat,fatih]

    }

    public static void listDegistir(List<String> list) {

        list=new ArrayList<>();
        list.add("nutella");
        list.add("cay");
        list.add("cokokrem");

        System.out.println("list degistir methodunda : "+list);//[nutella,cay,cokokrem]

    }

    public static void elemanlaridegistir(List<String> list) {

        list.set(0,"oguz");
        list.set(1,"murat");
        list.set(2,"fatih");
        System.out.println("eleman degistir methodunda :"+list);//[oguz,murat,fatih]
    }
}
