package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private Boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
        // getter methodu da tek bir satirlik islem yapiyor.baska class larin privite
        //oldugu icin erisemedigi tasitturu bilgisini,class icinden alip
        //istenen farkli class lar return ediyor
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    //return olmadigi icin bu metodun cagrildigi taşitRunner clasindan yazdirilamaz
    //1 satirlik islem var gönderdigimiz argumenti instance atar
    }

    public Boolean getMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(Boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}

