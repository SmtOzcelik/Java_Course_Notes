package day33_encapsulation;

public class Araba {
    String marka="Marka belirtilmedi";// marka nin access modifier default access
                                        // oldugundan package icinde kullanilabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektirikli";//tum arabalar elektrikli ise bu variable degistirilmemesi lazim
    // privite yaptiğimiz model ve yakit variable lerine erisim yetkilendirelim
    // model e deger atanabilsin ama görülemesin(setter)
    //yakit ise görülebilsin yeni deger atanamasin isteniyor (getter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
