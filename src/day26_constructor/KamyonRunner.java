package day26_constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri "+kamyon1.toString());

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,50000);
        System.out.println("Kamyon2 bilgileri "+kamyon2.toString());

        Kamyon kamyon3 =new Kamyon("Man","as9000",2007,40000);
        System.out.println("Kamyon3 bilgileri "+kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","S540");
        System.out.println("Kamyon4 bilgileri "+kamyon4);
    }
}
