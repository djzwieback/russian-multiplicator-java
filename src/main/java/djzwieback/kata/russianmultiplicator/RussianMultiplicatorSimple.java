package djzwieback.kata.russianmultiplicator;

public class RussianMultiplicatorSimple implements RussianMultiplicator {


    @Override
    public int mul(int x, int y) {
        return mul(x, y, 0);
    }

    private int mul(int x, int y, int sum) {
        if (1 == x) {
            return sum + y;
        } else {
            return mul(x / 2, y * 2, x % 2 * y + sum);
        }
    }
}
