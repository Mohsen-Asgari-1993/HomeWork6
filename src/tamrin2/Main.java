package tamrin2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i=0 ; i<10; i++){
            list.insert(random.nextInt(20)+5);
        }
        
    }
}
