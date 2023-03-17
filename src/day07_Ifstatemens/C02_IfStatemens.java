package day07_Ifstatemens;

public class C02_IfStatemens {
    public static void main(String[] args) {

    int d=15;
        if (d>0){
        System.out.println("sayi pozitiftir.");} // yazdırır
        if (d%2==0){
            System.out.println("sayi çiftir.");} // kod çalışır fakat şart tutmadığı için yazmaz
            if (d%5==0){
                System.out.println("sayi 5 in katıdır.");// yazdırır.
            }
    }
}
