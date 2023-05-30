package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

        int a=1000;
        int b=50;
        int sayac=1;
        while (sayac<100){
    /*
    try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
    islemleri yazmak icin kullanilir

    catch den sonraki parantez karsilasmayi bekledigimiz exception turunu
    java söylemek icin kullanilir

    catch blogu : java ya söyledigimiz exception(istisnai durum) gerceklesirse
    javanin yapmasini istedigimiz islem

    catch blogunun onudeki paranteze karsilasmayi bekledigimiz exception i
    yazabilir veya her turlu exception da devreye girmesini istiyorsak
    tum exception larin parenti olan Exception yazabiliriz
     */
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }
    // bu blok u olusturmak icin yukarida code tik surround with tik
            // biz try catch sectik

            b--;
            sayac++;
        }
    }
}
