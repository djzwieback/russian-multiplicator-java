package djzwieback.kata.russianmultiplicator;

import java.util.LinkedList;
import java.util.List;

public class RussianMultiplicator {

    private List<Integer> items = new LinkedList<>();

    public int multiplicate(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            return 0;
        }

        if (1 == firstNumber) {
            return items.stream().reduce(0, Integer::sum) + secondNumber;
        }

        if (firstNumber % 2 != 0) {
            items.add(secondNumber);
        }
        return multiplicate(firstNumber / 2, secondNumber * 2);
    }

    public int multiplicateV2(int firstNumber, int secondNumber) {
        return multiplicateV2(firstNumber, secondNumber, 0);
    }

    public int multiplicateV2(int firstNumber, int secondNumber, int sum) {
        if (1 == firstNumber) {
            return sum + secondNumber;
        } else {
            return multiplicateV2(firstNumber / 2, secondNumber * 2, firstNumber % 2 * secondNumber + sum);
        }
    }
}
