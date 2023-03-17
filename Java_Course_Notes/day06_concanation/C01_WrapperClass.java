package day06_concanation;

public class C01_WrapperClass {
    public static void main(String[] args) {

        //Wrapper class javanın hazır metodlarını kullanabilmemeiz için pirimiti
        // data türlerinin herbiri için açtığı classlardır.

        String str= "Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());

        //boolean guzelMi=true;
        //guzelMi // pirimitive olduğu için hazır metodlar gelmiyor.

        //Boolean buguzelMi=true;
        //buguzelMi.toString();  // boolean ı wrapper class yöntemi ile Boolean a çevirip
                               // hazır metodlar gelebiliyor.

        /*
        String ogrNo="12345";
        kullanıcıdan bir şifre isteyin.eğer şifre sadece rakamlardan oluşuyorsa kabul etmeyeceğim.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen beş basamaklı bir şifre giriniz.");
        String sifre=scan.nextLine();
        Integer yenisifre=Integer.parseInt(sifre);
        System.out.println("Şifrenin 3 fazlası="+(sifre+3));
        System.out.println("Şifrenin 3 fazlası="+(yenisifre+3));
        */





    }
}
