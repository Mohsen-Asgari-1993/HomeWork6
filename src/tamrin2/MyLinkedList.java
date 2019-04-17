package tamrin2;

public class MyLinkedList<E> {

    private static int size = 0;
    private MyNode first;

    public boolean isNull() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    private class MyNode {
        E item;
        MyNode next;

        MyNode(E e) {
            this.item = e;
            this.next = null;
        }
    }
}
