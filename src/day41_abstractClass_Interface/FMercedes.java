package day41_abstractClass_Interface;

public class FMercedes extends DAraba{

    @Override
    public void motor() {
        /*
        Abstract bir parent in concrete child class inherit ederse parent abstrack
        class daki tum abstract methodlari override etmek zorundadir.

        Abstract bir class, abstract baska bir class i parent edinirse
        parent class daki tum abstract methodlari override etmek ZORUNDA DEGİLDİR
         */
    }

    @Override
    public void yakit() {

    }

    @Override
    public void kaporta() {

    }
}
