package day35_inheritancedaConstructorKullanimi;

import com.sun.org.apache.xpath.internal.operations.Gt;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla(){

        System.out.println("KDizelCorolla paremetresiz constructor");
    }
    KDizelCorolla(String isim){
        super(isim);

        System.out.println("KDizelCorolla paremetreli constructor");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1=new KDizelCorolla("isim");


    }
}
