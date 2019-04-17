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

    public void deleteByKey(E e) {
        MyNode currnet = this.first, prev = null;
        if (currnet != null && currnet.item == e) {
            this.first = currnet.next;
            System.out.println(e + " found and deleted");
            size--;
            return;
        }
        while (currnet != null && currnet.item != e) {
            prev = currnet;
            currnet = currnet.next;
        }
        if (currnet != null) {
            prev.next = currnet.next;
            System.out.println(e + " found and deleted");
            size--;
        } else {
            System.out.println("Key not found ");
        }
    }

    public void deleteByPosition(int index) {
        if (index >= this.size()) {
            System.out.println("index not found");
            return;
        }
        MyNode current = this.first, prev = null;
        if (index == 0 && current != null) {
            this.first = current.next;
            System.out.println("element in " + index + " position deleted ");
            size--;
            return;
        }
        int counter = 0;
        while (current != null) {
            if (index == counter) {
                prev.next = current.next;
                System.out.println("element in " + index + " position deleted ");
                size--;
                break;
            } else {
                prev = current;
                current = current.next;
                counter++;
            }
        }
        if (current == null) {
            System.out.println("index not found");
        }
    }

    public void search(int index) {
        MyNode node = this.first;
        if (isNull() || index >= size()) {
            System.out.println("index not found");
            return;
        } else {
            if (index == 0 && node != null) {
                System.out.println(node.item);
                return;
            }
            int counter = 0;
            while (node != null) {
                if (index == counter) {
                    System.out.println(node.item);
                    return;
                } else {
                    node = node.next;
                    counter++;
                }
            }
        }
        System.out.println("index not found ");
    }

    public boolean contain(E e) {
        MyNode node = this.first;
        if (isNull()) {
            return false;
        } else {
            while (node != null) {
                if (node.item == e) {
                    return true;
                } else {
                    node = node.next;
                }
            }
        }
        return false;
    }
}
