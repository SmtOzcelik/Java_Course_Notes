package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes{

    /*
    Abstract parent silsilesinden gelen ilk concrete class parent i olan
    tum class larda ki abstract methodlari concrete hale donusturmak(override etmek)
    zorundadir.

    Bu kuralin istisnasi parent class lardan herhangi birinde concrete hale
    donusturulmus, abstract method lardir
     */

    public static void main(String[] args) {

        HA160 arb1=new HA160();
        // concrete bir class dan istedigimiz bir objeyi uretibiliriz

        FMercedes arb2=new FMercedes();
        //mercedes de concrete

       // EToyota arb3=new EToyota();
       // EToyota arb4=new GCoralla();
        // Abstruct class lar constructor barindirir ama obje uretemezler
        // Toyota class i abstruct class oldugundan obje uretilemez

        /*

        List<String>list1 =new List<String>();
        List<String>list2=new ArrayList<>();

        Abstruct bir class in ozelliklerini tasiyan bir obje olusturmak istedegimizde
        data turunu istedigimiz abstract class construtor ise child i olan
        concrete bir class dan seceriz
         */
    }
}
