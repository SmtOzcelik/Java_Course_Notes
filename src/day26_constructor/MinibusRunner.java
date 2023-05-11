package day26_constructor;

public class MinibusRunner {
    public static void main(String[] args) {

        Minibus minibus=new Minibus();

        minibus.marka="Karsan";
        minibus.model="j10";
        minibus.yil=2010;
        minibus.fiyat=78000;
        System.out.println("Minibus bilgileri :"+ minibus.toString());

        Minibus minibus1=new Minibus("Pejo","Partner",2015,80000);
        System.out.println("Minibus1 bilgileri "+ minibus1.toString());

    }
}
