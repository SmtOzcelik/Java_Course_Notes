package day39_exception;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable i kullanmaya calisirsaniz
        Java Compile time da bunu farkeder ve size izin vermez
         */
        str=null;
        // System.out.println(str.length());
        // NullPointerException

        Object obj="Java Java Java";
       // Integer sayi =(Integer) obj;   //ClassCastException

        /*
       String str2="Hava Bozuk";
        Integer sayi=str2;

        Java bazi casting islemlerde compile time da izin vermez

        Ancak bazen syntax uygun olabilir bu durum da kodun
        calismasina itiraz etmez

         */
        Thread.sleep(5000);//Kod 29. satira geldi mi 5sn bekletir
    }

}
