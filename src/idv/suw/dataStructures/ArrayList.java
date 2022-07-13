package idv.suw.dataStructures;

public class ArrayList<E> implements List<E>{
    private Object[] arrayList;
    private int lastIndex = 0;

    public ArrayList() {
        arrayList = new Object[32];
    }

    public ArrayList(int size) {
        arrayList = new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == 0;
    }

    @Override
    public void insertAt(int index, E e) {

    }

    @Override
    public void insertFirst(E e) {
        E temp = (E) arrayList[0];

        if(!isEmpty()) {
            for(int i = 0; i <= lastIndex; i++) {
                arrayList[i] = e;
            }
        }
    }

    @Override
    public void insertLast(E e) {
        if(!isEmpty()) {
            arrayList[lastIndex] = e;
        } else {
            arrayList[0] = e;
        }
        lastIndex++;
    }

    @Override
    public void deleteAt(int index) {

    }

    @Override
    public void deleteFirst() {
        if(!isEmpty()) {
            for(int i = 0; i <= lastIndex; i++) {
                arrayList[i] = arrayList[i + 1];
            }
        }
    }

    @Override
    public void deleteLast() {
        if(!isEmpty()) {
            arrayList[lastIndex] = null;
            lastIndex--;
        }
    }

    @Override
    public void show() {
        for(int i = 0; i < arrayList.length; i++) {
            System.out.printf("index: %d, item: %s ", i, arrayList[i]);
        }
    }
}
