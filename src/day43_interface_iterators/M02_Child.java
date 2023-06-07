package day43_interface_iterators;

public class M02_Child implements I01_InterfaceBodyOlanMethod {

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interface abstract olan 3 methodu implement ettigimizde java
    itirazini durdurur. Sonradan ekledigimiz defeult veya static keyword
    ile tanimladigimiz methodlari implement etmememiz sorun olusturmadi.
     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();

        M02_Child obj=new M02_Child();
        obj.teker();
    }
}
