package djzwieback.kata.russianmultiplicator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RussianMultiplicatorWithListTest {

    @Test
    void multiplicateWithZeroEqualsZero() {
        RussianMultiplicatorWithList russianMultiplicatorWithList = new RussianMultiplicatorWithList();
        int result = russianMultiplicatorWithList.mul(0, 2);

        Assertions.assertEquals(0, result);
    }

    @Test
    void multiplicateExampleIsCorrect() {
        RussianMultiplicatorWithList russianMultiplicatorWithList = new RussianMultiplicatorWithList();
        int result = russianMultiplicatorWithList.mul(47, 42);

        Assertions.assertEquals(1974, result);
    }
}
