package generic;

import java.util.Deque;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.add("One"); // add
        deque.addFirst("Two"); // insert at front
        deque.addLast("three"); // insert at back/rear
        deque.push("Four");
        deque.offer("Five");
        deque.offerFirst("Fivssde");

        System.out.println(deque);

        Iterator iterator = deque.iterator();

    }
}
