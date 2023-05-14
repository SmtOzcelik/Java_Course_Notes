package day29_passByValue_immutable;

public class C04_immutable {
    public static void main(String[] args) {
        /*
        Immutable : degistirilemez
        Mutable   : degistirilebilir

        en meshur immutable class : String
         */

        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());//YILDIZ BANK
        // String Immutable oldugundan degistirilemez.asagida ki orneklerde
        // atama yapilmadiği sürece değisiklik olmaz
        str.toLowerCase();

        System.out.println(str); //Yildiz Bank

        str.substring(3,5);// sout olmadigindan yazdirmaz ama "di" dir

        System.out.println(str);//Yildiz Bank

        //java da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class i da vardir.

        StringBuilder sb= new StringBuilder("Java Bank");
        System.out.println(sb);// Java Bank
        // StringBuilder Mutable oldugundan degistirebilir
        // atama yapilmasa bile değisir

        sb.reverse();// ters yazdirma komutu

        System.out.println(sb);//knaB avaJ

        sb.append(".");//sonuna ekleme komutu

        System.out.println(sb);//knaB avaJ.

        //



    }
}
