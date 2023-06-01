package day40_final;

public abstract class CAbstract { //class basina abstract yazarsak abstract class olur

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();

    void cikarma(){
        System.out.println("bu method cikarma yapar");
    }
    /*
    Bir methodun basina abstract yazarsaniz bu methodun child classlar icin
    bir standart oludugunu declare ederiz ve method body sine ihtiyac kalmaz
     */
}
