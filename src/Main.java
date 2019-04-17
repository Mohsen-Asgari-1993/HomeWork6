import java.util.ArrayList;
import java.util.Random;

public class Main {

    private static void initializeList(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(16) + 5; i++) {
            list.add(random.nextInt(201) - 100);
        }
    }
}
