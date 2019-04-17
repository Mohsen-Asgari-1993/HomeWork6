import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static void initializeList(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(16) + 5; i++) {
            list.add(random.nextInt(201) - 100);
        }
    }

    private static void sort(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i -= 2) {
            if (list.get(i) < list.get(i - 1)) {
                list.remove(i);
                list.remove(i - 1);
            }
        }
    }
}
