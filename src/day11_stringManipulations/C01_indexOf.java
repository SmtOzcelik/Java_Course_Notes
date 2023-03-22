package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        /*
        Verilen bir string de herhangi bir string veya char in
        ilk kullanıldığı index i bize döndürür.
        */

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf('r')); //7
        System.out.println(str.indexOf('j')); // -1 oladığında çıkar çünkü küçük j yok

        System.out.println(str.indexOf("mek")); // bi blok gibi düşünür. ilk harfe gelince okur
                                                // yani mekk de m ye gelince okur. sonuç 10
        /*
        Eğer istediğimiz index den sonrasını kontrol etmek istersek
        o zaman aynı metodu 2 pare metreli olarak kullanabilir.
        */

        System.out.println(str.indexOf("g",(6+1)));// yazılan indeksden(7) sonra (g) aramaya başlar.
        // indexof un 4 betodun dan biri seçip uyguladik.

        // yukarıdaki str da 2. ve 3. e nin indekslerini bulunuz
        // 2.ci e yi bulabilmek için 1. e nin indeksine ihtiyacım var

        int ilke=str.indexOf("e");
        int ikincie= str.indexOf("e",ilke+1);

        // eğer 2. e varsa 3. e nin olup olmadığını  ve varsa index yazdıralım.

        if (ikincie==-1){
            System.out.println("Verilen srt da 2. e yok");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str de 3. e yok");
            }else {
                System.out.println("verilen str deki 3. e index i="+ ucuncue);
            }
        }



    }
}
