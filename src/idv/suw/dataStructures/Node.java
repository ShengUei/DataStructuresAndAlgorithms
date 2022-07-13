package idv.suw.dataStructures;

public class Node<E> {
    public E item;
    public Node next;

    public Node() {}

    public Node(E item) {
        this.item = item;
    }

    public Node(E item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
