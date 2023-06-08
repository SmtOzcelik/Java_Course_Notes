package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4=new LinkedList<>();

        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Samet");
        ll4.add("Tevfik");
        ll4.add("Samet");

        ll4.removeLastOccurrence("Samet");
        System.out.println(ll4);//[Cavidan, Mesut, Samet, Tevfik]

        System.out.println(ll4.pop());

        ll4.remove();
        ll4.removeLast();
        ll4.removeFirst();
        //Deque iki taraflı queue demektir Dolayisiyla her methodun first ve last i vardir.
    }
}
