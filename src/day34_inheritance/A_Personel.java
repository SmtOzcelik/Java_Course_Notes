package day34_inheritance;

public class A_Personel {
    /*
    Eger parent class olacak sekilde tasarladiğiniz bir class varsa veya ilerde
    bu class ı parent yapmak isteyenler olabilir diyorsaniz variable ve method larin
    access modifier ini protected dir
     */

    protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected String depertman="Depertman belirtilmedi";

    protected  void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretin statusune gore alir ");
    }
}
