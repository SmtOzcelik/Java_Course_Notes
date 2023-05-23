package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");
        // append sonuna ekleme metodu
        sb.append("?");
        System.out.println(sb);//Java daha ne yapsin?



        //araya eklemek icin insert() metodu kullanilir
        sb.insert(4," artik");
        System.out.println(sb);//Java artik daha ne yapsin?








    }
}
