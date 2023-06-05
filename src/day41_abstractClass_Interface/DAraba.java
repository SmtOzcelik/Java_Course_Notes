package day41_abstractClass_Interface;

public abstract class DAraba { // abstract olmasi icin class onune yazdik
    public static void main(String[] args) {
        /*
         abstract class da main method opsiyonel dir.
         Eger abstract class sadece child class larin tasimak zorunda oldugu
         ozellikleri belirlemek icin olusturulduysa main methoda ihtiyac olmaz
         sadece abstract method lar olur

         Ama bir abstrack method da standart belirlemek disinda da methodlar
         calisabilir. Bu durumda ihtiyac olursa main method olusturulabilir.

         */
    }
    public abstract void motor();

    public abstract void yakit();

    public abstract void kaporta();
    /*
    Sadece child class larin mecburi tasiyacaklari ozellikleri belirleyen methodlar
    abstract method olur ve abstract methodlarin bady si olmaz.
     */

    public void klima(){
        System.out.println("bazi arabalarda klima olabilir");
        /*
        Abstract olmayan methodlara concrete method denir
        Abstract bir methodu abstract keyword ile belirtmek ZORUNLUDUR.
        Concrete method larda bunun declare edilmesine gerek yoktur.
        Biz sadece abstraction ile ilgili konustugumuzda abstract olmayan
        method lardan bahsetmek icin concrete tabirini kullaniriz
         */
    }
}
