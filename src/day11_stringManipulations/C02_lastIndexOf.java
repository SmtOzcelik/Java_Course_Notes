package day11_stringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kalay, Java cok guzel";
        String kelime="Java";

        /*
        Verilen kelime için aşağıdaki şartlardan uygun olani
        yazan bir program yazınız.
        -verilen kelime cumlede kullanılmamış
        -verilen kelime cumlede sadece 1 kere kullanılmis
        -verilen kelime cumlede birden fazla kullanılmış
        */

        int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonIndex=cumle.lastIndexOf(kelime);

        if(kelimeIlkIndex==-1){
            System.out.println("Verilen kelime cumlede kullanılmamıştır.");
        } else if (kelimeIlkIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanılmiş");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanılmıştır");
        }


    }
}
