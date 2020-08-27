package djzwieback.kata.russianmultiplicator;

import java.util.LinkedList;
import java.util.List;

public class RussianMultiplicatorWithList implements RussianMultiplicator {

    private List<Integer> items = new LinkedList<>();

    @Override
    public int mul(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }

        if (1 == x) {
            return items.stream().reduce(0, Integer::sum) + y;
        }

        if (x % 2 != 0) {
            items.add(y);
        }
        return mul(x / 2, y * 2);
    }
}
