package day19_Scope;

public class C01_InstanceVeriable {

    /*
    Class içerinde her yerden kullanmak istediniz veriablelari class
    level(class in içerisinde ama method larin dışında) de
    genellikle class level variable lar class in basinda olusturulur(sart degil)

     class level deki variable ler için 2 scope vardir.
     1- static variables (class variable leri de denir)
     2- instance (static olmayan) variables (obje variable i de denir)
     */

    int instsayi=20;  // static olmayip class level de oldugu için instance variable dir.


    public static void main(String[] args) {
        int sayi=10;
        /*
        System.out.println(instsayi);
        instance veriables static olmadiği için static klup e uye main method dan direk kullanamayiz
        instance veriables larin diğer adı object variable dir.
        dolayisiyla obje oluşturursaniz instance variables leri heryerden kullanabilirsiniz
        */

        C01_InstanceVeriable obje1=new C01_InstanceVeriable();
        System.out.println("obje1 degismeden önce : "+obje1.instsayi); // 20 yazdirir.
        obje1.instsayi=30;
        System.out.println("obje1 degistikden sonra : "+obje1.instsayi);// 30 yazdirir.

        C01_InstanceVeriable obje2=new C01_InstanceVeriable();
        System.out.println("obje degismeden once : "+obje2.instsayi); // 20 yazdirir.
        obje2.instsayi=25;
        System.out.println("obje2 degistikden sonra = " +obje2.instsayi );// 25 yazdirir.

        /*
        COOKKK ÖNEMLİ
        her obje oluştuğunda instance (obje) varible nin ilk atanın degerini alir
        */
    }

    public static void staticMethod(){
        /*
        instance variable lara main method dişindaki satatic method da direk ulaşamayiz
        obje oluşturarak ulaşabilir.
        */

        C01_InstanceVeriable obje4=new C01_InstanceVeriable(); //class ismi obje=new clas ismi
        System.out.println(obje4.instsayi);// 20 iyi alir.

    }

public void staticolmayanMethod(){
    System.out.println(instsayi);
    /*
    instance veriable ler class içerisdeki static olmayan method lardan direk kullanilabilir
    */


}

}
