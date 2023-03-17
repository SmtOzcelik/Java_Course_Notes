package day07_Ifstatemens;

public class C01_RelationDeneme {
    public static void main(String[] args) {

        // == işareti eşitlik demek.
        boolean sonuc1=5+2==7; // --> sonuc1=true
        System.out.println("sonuc1="+sonuc1);

        // != işareti eşit değil demek.
        boolean sonuc2=5+2!=7; //--> sonuc2=false
        System.out.println("sonuc2="+sonuc2);

        //boolean bir veriable veya sonucun başına ! koyarsak tersini alır.
        boolean sonuc3=!(3*5>5); // --> false
        System.out.println("sonuc3="+sonuc3);

        // && işareti ile birleştirme ve
        boolean sonuc4=(5+2==7)&&(4+3!=5);// --> true
        System.out.println("sonuc4="+sonuc4);

        /*
        || işareti ile birileştirme veya
        boolean sonuc5=(5+2==7)II(4+3!=5);
        System.out.println("sonuc5="+sonuc5);
        */


    }


}
