package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.model="Toyota";

     System.out.println("Car1 bilgileri\nMarka : "+car1.marka +
             "\nModel : " + car1.model+
             "\nYil : "+car1.yil+
             "\nFiyat : "+car1.fiyat);

     Car car2=new Car();
        System.out.println("Car2 bilgileri\nMarka : "+car2.marka +
                "\nModel : " + car2.model+
                "\nYil : "+car2.yil+
                "\nFiyat : "+car2.fiyat);

        /*
        Herhangi bir obje uzerinden bir variable yazdırmaya calistigimizda
        Java degeri su siralamayla arar.
        1- o obje olusturulduktan sonra bir deger atandi mi?
        2- objenin olusturuldugu class da variable a bir deger atanmis mi bakar
        3- o zaman data turune göre java default degeri atar.
         */
    }
}
