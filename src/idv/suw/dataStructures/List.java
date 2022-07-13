package idv.suw.dataStructures;

public interface List<E> {

    boolean isEmpty(); //true if list is empty

    void insertFirst(E e); //insert at start of list

    void insertLast(E e); //insert at end of list

    void deleteFirst(); //delete first item

    void deleteLast(); //delete last item

    void show();

}
