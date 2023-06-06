package day42_abstractClass_Interface;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{
    /*
    Bir class i bir interface e child yapmak icin implements keyword kullanilabilir.
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.sayi);//20
        System.out.println(I02_Interfaces.sayi);//40

        System.out.println(Isim);// Yildiz Koleji
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
