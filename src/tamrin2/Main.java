package tamrin2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list.isNull());
        for (int i=0 ; i<10; i++){
            list.insert(random.nextInt(20)+5);
        }
        System.out.println(list.isNull());
        System.out.println(list);
        list.deleteByPosition(5);
        System.out.println(list);
        list.deleteByPosition(0);
        System.out.println(list);

        list.addNode(48,7);
        System.out.println(list);

        list.deleteByKey(48);
        System.out.println(list);

        list.search(8);


        System.out.println(list.contain(10));
        list.insert(99);
        System.out.println(list.contain(99));

        System.out.println(list);
        System.out.println("is 10 in list? : "+list.contain(10));
        list.insert(99);

        System.out.println(list);
        System.out.println("is 99 in list? : "+list.contain(99));

        System.out.println("Bye");
    }
}
