package idv.suw.dataStructures;

public interface Collection<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean contains(E e);

    boolean isEmpty();

    void clear();
}
