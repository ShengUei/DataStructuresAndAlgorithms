package idv.suw.dataStructures;

public class LinkedList<E> implements List<E> {
    private Node<E> head;

    public LinkedList() {
        this.head = new Node<>(null, null);
    };

    @Override
    public boolean isEmpty() {
        if(head.next == null) {
            return true;
        }
        return false;
    }

    @Override
    public void insertFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if(isEmpty() == true) {
            head.next = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    @Override
    public void deleteFirst() {
        if(isEmpty() == false) {
            head.next = head.next.next;
        }
    }

}
