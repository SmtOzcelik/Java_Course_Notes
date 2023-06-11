package day47_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenelCozum {
    public static void main(String[] args) {

        Map<Integer,String> sinifMap=new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, Java");
        sinifMap.put(104,"Derya, Deniz, Devops");
        sinifMap.put(105,"Enes, Can, Tester");
        sinifMap.put(106,"Taha, Deniz, JDev");
        sinifMap.put(107,"Derya, Cem, Tester");

        // Soru:1  sırali şekilde ogrencilerin ad soyad yazdirin

        Collection<String>ogrncValue=sinifMap.values();
        String eachArr[];
        Integer sira=1;
        for (String each :ogrncValue
        ) {
            eachArr=each.split(", ");
            System.out.println(sira+" "+eachArr[0]+" "+eachArr[1]);
            sira++;

        }

        //Soru2: Branslardan kacar tane var yazdirin Tester=3 gibi
        // yeni bir map olusturmaliyiz key =String value=Integer

        Map<String,Integer>branssayisi=new HashMap<>();
        Integer valueSayi;
        String brans;
        for (String each:ogrncValue
             ) {
            eachArr=each.split(", ");
            brans=eachArr[2];
            if (!branssayisi.containsKey(brans)){
                branssayisi.put(brans,1);
            }else {
                valueSayi=branssayisi.get(brans);
                branssayisi.put(brans,valueSayi+1);

            }
        }
        System.out.println(branssayisi);

        //Soru3:Map i guncelleme yapmak icin (key,yeni degeri) map e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin siniflistMap.put(101,Ali, Can, JavaDeveloper)

        // bunu yapabilmek icin herbir key e ve ona ait value ya ihtiyacim var

        Set<Integer> keySeti=sinifMap.keySet();
        String yenivalue;
        for (Integer each:keySeti
             ) {
            yenivalue=sinifMap.get(each);
            yenivalue=yenivalue.replaceAll("JDev","JavaDeveloper");
            sinifMap.put(each,yenivalue);

        }
        System.out.println(sinifMap);

        //Soru4: her bir elemani alt alta yazdirin
        //entrySet methodu Set donderdigi icin Set tanimladik attik

        Set<Map.Entry<Integer,String>>entrySeti=sinifMap.entrySet();

        for (Map.Entry<Integer,String>each:entrySeti
             ) {
            System.out.println(each);
        }

        //Soru4: Map in tum elemanlarinda varsa Tester kurs ismini QA olarak degistirelim

        String yenientrey;
        for (Map.Entry<Integer,String>entry:entrySeti
             ) {
            yenientrey=entry.getValue();
            yenientrey=yenientrey.replaceAll("Tester","QA");
            entry.setValue(yenientrey);
        }

        System.out.println(sinifMap);

        //Soru5: soyisim Can olanlarin bransini DataScience yapalim
        String entryArr[];
        String entryValue;
        for (Map.Entry<Integer,String> entry:entrySeti
             ) {
            entryValue=entry.getValue();
            entryArr=entryValue.split(", ");
            if (entryArr[1].equals("Can")){
                entryArr[2]="DataScince";
                entry.setValue(entryArr[0]+" "+entryArr[1]+" "+entryArr[2]);
            }
        }
        System.out.println(sinifMap);
    }
}
