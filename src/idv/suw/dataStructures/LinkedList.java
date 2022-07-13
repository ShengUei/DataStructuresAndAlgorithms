package idv.suw.dataStructures;

public class LinkedList<E> implements List<E> {
    private Node<E> head;

    public LinkedList() {
        this.head = new Node<>(null, null);
    }

    @Override
    public boolean isEmpty() {
        return head.next == null;
    }

    @Override
    public void insertAt(int index, E e) {
        int pointer = 0;
        Node<E> currentNode = head;
        Node<E> newNode = new Node<>(e);

        if(!isEmpty()) {
            while(pointer < index) {
                currentNode = currentNode.next;
                pointer++;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else {
            insertFirst(e);
        }
    }

    @Override
    public void insertFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if(!isEmpty()) {
            newNode.next = head.next;
        }

        head.next = newNode;
    }

    @Override
    public void insertLast(E e) {
        Node<E> newNode = new Node<>(e);
        Node<E> currentNode = head.next;

        if(!isEmpty()) {
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
        }
        currentNode.next = newNode;
    }

    @Override
    public void deleteAt(int index) {
        int pointer = 0;
        Node<E> currentNode = head.next;

        if(!isEmpty()) {
            while (pointer < index - 1) {
                currentNode = currentNode.next;
                pointer++;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    @Override
    public void deleteFirst() {
        if(!isEmpty()) {
            head.next = head.next.next;
        }
    }

    @Override
    public void deleteLast() {
        Node<E> currentNode = head.next;
        Node<E> prev = currentNode;

        if(!isEmpty()) {
            while (currentNode.next != null) {
                prev = currentNode;
                currentNode = currentNode.next;
            }

            prev.next = null;
        }
    }

    @Override
    public void show() {
        Node<E> temp = head;

        while (head.next != null) {
            head = head.next;
            System.out.print(head.toString());
        }

        head = temp;
    }

}
