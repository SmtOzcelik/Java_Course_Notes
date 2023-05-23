package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java her zaman guzel");

        sb.delete(8,9);
        System.out.println(sb);//Java herzaman guzel bosluk gitti

        sb.deleteCharAt(7);
        System.out.println(sb);//Java hezaman guzel


    }
}
