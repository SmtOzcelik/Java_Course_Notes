package day27_statickKeyword;

public class C01 {
    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        class level da iki tur variable olusturabiliriz
        static (class) variable
        instance (obje) variable
        static variable lar tum class dan kullanilabilirken
        instance olanlar static olmayan metodlardan kullanilabilir.
        instance variable lara static method dan ulusmak istersek
        obje olusturmamiz gerekir.
         */

        C01 obje1=new C01();
        System.out.println("obje1 in rakam degeri : "+ obje1.rakam);// 5
        System.out.println("obje1 in sayi degeri : "+sayi);//10 -> obje1.sayi yazmaya gerek yok sayi static oldugu icin
                                                            // ama sayi degerini yukarıdan 22 satira kadar incele
                                                            // atama veya degisme oldugunda en son degere bak
        obje1.rakam+=1; // 5+1=6 obje gerek var satatic degil
        sayi+=1; //10+1=11 objeye gerek yok cunku static

        System.out.println("1 artırdıktan sonra obje1 in rakam degeri : "+ obje1.rakam);//
        System.out.println("1 artırdıktan sonra obje1 in sayi degeri : "+sayi);

        C01 obje2=new C01();

        System.out.println("obje2 in rakam degeri : "+ obje2.rakam);//5-> obje2 olusturulduktan sonra rakam a
                                                                    // deger atamasi yok ilk değeri al
        System.out.println("obje2 in sayi degeri : "+sayi);//11 sayi static oldugu icin her yerde kullanildigindan
                                                        // tamamini incele en son degerini bul yaz

        obje2.rakam++; // 5+1=6
        sayi++;//11+1=12

        System.out.println("1 artırdıktan sonra obje2 in rakam degeri : "+ obje2.rakam);// 6
        // obje2.rakam a bakarken obje2 nin olusturuldugu yerden incele gel
        System.out.println("1 artırdıktan sonra obje2 in sayi degeri : "+sayi);//12
        // sayi static oldugundan yukarıdan class dan buraya kadar incele gel yaz

        /*
        instance variable lar obje variable i oldugu icin herhangi bir satırda instance
        variable in degerinin  ne oldugunu bulmak icin OBJE OLUSTURULAN SATİRDAN
         itibaren kod incelenmelidir.

        static variable lar class variable oldugu icin herhangi bir satirda static
        variable in degerini bulmak icin CLASS BASİNDAN itibaren kod incelenmelidir.
         */
    }

}
