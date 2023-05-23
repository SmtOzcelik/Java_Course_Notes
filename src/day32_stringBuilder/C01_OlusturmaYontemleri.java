package day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sbr1=new StringBuilder();
        StringBuilder sbr2=new StringBuilder("Java Candir...");
        StringBuilder sbr3=new StringBuilder(10);

        System.out.println(sbr1.length());//0
        System.out.println(sbr1.capacity());//16

        System.out.println(sbr2.length());//14
        System.out.println(sbr2.capacity());//30

        System.out.println(sbr3.length());//0
        System.out.println(sbr3.capacity());//10

        sbr1.append("Java");
        System.out.println(sbr1.length());//4
        System.out.println(sbr1.capacity());//16

        sbr1.append(" Candir");
        System.out.println(sbr1.length());//11
        System.out.println(sbr1.capacity());//16

        sbr1.append(", bilen bilir.");
        System.out.println(sbr1.length());//25
        System.out.println(sbr1.capacity());//34 (16*2+2 java kurali)

        StringBuilder sbr4=new StringBuilder();
        sbr4.append("Java Candir");

        System.out.println(sbr4.length());//11
        System.out.println(sbr4.capacity());//16





    }
}
