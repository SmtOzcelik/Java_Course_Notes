package day12_StringManipulation;

public class C02_replacaAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el=";

        // str ı Bugun Java cok guzel haline getirin.
        // replacaAll() metodundaki all in amacı aynı özellekteki tüm karaterleri kapsamasıdır.
        //butun sayıları sil
        //butun ozel karakterleri sil \
        // tum özel karakterleri silelim dediğimizde spaceler de siliniyor
        //space leri korumak için en başta onlarin yerine cümlede bulunmayacak bir string koyalim

         str=str.replaceAll(" ","qazwsx");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");

        // istenmeyen ozel karakter ve sayılardan kurtulduk şimdi spaceleri geri getirelim

        str=str.replaceAll("qazwsx"," ");
        System.out.println(str);


    }
}
