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

    public void insert(E e) {
        MyNode myNode = new MyNode(e);
        myNode.next = null;

        if (this.first == null)
            this.first = myNode;
        else {
            MyNode last = this.first;

            while (last.next != null) {
                last = last.next;
            }
            last.next = myNode;
        }
        size++;
    }

    public void addNode(E e, int index) {
        MyNode node = new MyNode(e);
        MyNode current = this.first, prev = null;
        if (this.first == null) {
            this.first = node;
            size++;
        } else {
            if (index == 0) {
                node.next = current;
                this.first = node;
                size++;
                return;
            }
            int counter = 0;
            while (current != null) {
                if (index == counter) {
                    node.next = current;
                    prev.next = node;
                    size++;
                    return;
                } else {
                    prev = current;
                    current = current.next;
                    counter++;
                }
            }
        }
        System.out.println("index not found ");
    }
}
