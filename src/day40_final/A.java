package day40_final;

public class A {

  protected String isim="Cuneyt";
    static final String OKUL="Yildiz Koleji";//final de variable lar buyuk harfle yazilir
    /*
      bir variable final olarak tanimlandiysa baska class lardan veya icinde
      oldugumuz class dan bu variable a baska deger atanmasi mumkun degildir.

      Madem ki degeri degistirilemiyor genelde static de yaparak bu variable a
      erisim kolaylastirilabilir.
      Genelde static final olarak belirlenen variable isimleri BUYUK HARF ile yazilir

     */

      final void finalMethod(){
        System.out.println("final method lar override edilemez");
        /*
        bir methodu final olarak isaretlerseniz bu method degistirilemez demektir.
        (override edilemez)
         */

  }
}
