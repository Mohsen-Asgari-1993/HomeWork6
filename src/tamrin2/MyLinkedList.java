package tamrin2;

public class MyLinkedList<E> {

    private class MyNode {
        E item;
        MyNode next;

        MyNode(E e) {
            this.item = e;
            this.next = null;
        }
    }
}
