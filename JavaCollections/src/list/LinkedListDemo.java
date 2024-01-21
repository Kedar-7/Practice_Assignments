package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        
        System.out.println(linkedList);
        System.out.println("Using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        

        System.out.println("Using for-each loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
