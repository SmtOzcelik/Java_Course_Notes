package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable ye ulasabildim,
        // degistirebildim(set) yazdirabildim(get)
        arb1.marka="Toyata";
        System.out.println(arb1.marka);

        //accesc modifier kullanarak marka variable ina ulusimi tamamen serbest
        //yapilabilir veya tamamen engelleyebilirim.
        // pirivate yaptigimiz modele ise hic ulasamayiz
        // arb1. yaptigimizda marka yi göremeyiz cünku araba class da pirivite yaptik
        // yani access modifier ya hep ya hic diyor

        // modeli i degistirelim ama göremeyelim
        // yakiti görelim ama degistiremeyelim

        /*
        set ve get yetkilerini özel olakak tanimlamak isterseniz
        1.adim -- özel yetki tanimlayacaginiz variable lari privite yapin
         privite bir dataya baska class lardan ulasmak mumkun olmadigindan
        2.adim -- set yetkisi icin setter, get yetkisi icin getter methodlarin yapalim.
         */

        arb1.setModel("Corolla");// model olarak corolla yi atadik
        //modeli yazdirma imkanimiz yok cunku getter methodu yok
        System.out.println(arb1.getYakit());// elektirikli bilgisini yazdirabildik
        //yakiti degistiremeyiz cunku setter methodu yok
    }
}
