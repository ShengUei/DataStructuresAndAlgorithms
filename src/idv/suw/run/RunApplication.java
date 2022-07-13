package idv.suw.run;

import idv.suw.dataStructures.LinkedList;

public class RunApplication {
    public static void main(String[] args) {
        LinkedList<Integer> testLinkedList = new LinkedList<>();

        testLinkedList.insertFirst(1);
        testLinkedList.insertFirst(2);
        testLinkedList.insertFirst(3);
        testLinkedList.insertFirst(4);
        testLinkedList.insertFirst(5);

        testLinkedList.insertLast(6);
        testLinkedList.insertLast(7);
        testLinkedList.insertLast(8);

        testLinkedList.show();

        System.out.println("");
        System.out.println("============================================");

        testLinkedList.deleteFirst();

        testLinkedList.deleteLast();

        testLinkedList.show();

        System.out.println("");
        System.out.println("============================================");

        testLinkedList.insertAt(2, 100);

        testLinkedList.show();

        System.out.println("");
        System.out.println("============================================");

        testLinkedList.deleteAt(2);

        testLinkedList.show();

    }
}
