package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        Elimizde ürünlerin bulundugu bir liste var. ürün listedeki istenen sıradaki
        urunu istediğimiz yeni urunle degistirip eski urunu, varolan eski urunler listesine eklyelim*/

        List<String> urunler=new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler=new ArrayList<>();

        //listedeki ikram in yerine biskrem koyalim
        //ikrami da eski urunler listesine ekleyelim.

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun); // set 2 is yapti. istenileni degiştirdi.
                                                       // değiştirilen (eski) urunu getirdi
                                                        // bizde silinenUrun e atadık

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler liste ;"+urunler);
        System.out.println("eski urunler listesi"+ eskiUrunler);

        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler liste ;"+urunler);
        System.out.println("eski urunler listesi"+ eskiUrunler);

    }
}
