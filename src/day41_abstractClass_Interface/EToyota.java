package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{

    @Override
    public void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }

    /*
    Parent class daki standart belirleyici methodlar (abstract methodlarn)
    tamamı child class tarafından override edilmelidir.

    Concrete methodlarin override edilme mecburuyeti yoktur.
    istersek override ederiz, istemezsek etmeyiz

    Aslinda toyota class i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz toyota class ini da abstract
    yapmaniz guzel olur.
     */
}
