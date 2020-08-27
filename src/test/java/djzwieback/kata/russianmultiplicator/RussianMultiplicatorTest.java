package djzwieback.kata.russianmultiplicator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RussianMultiplicatorTest {

    @Test
    void multiplicateWithZeroEqualsZero() {
        RussianMultiplicator russianMultiplicator = new RussianMultiplicator();
        int result = russianMultiplicator.multiplicate(0, 2);

        Assertions.assertEquals(0, result);
    }

    @Test
    void multiplicateExampleIsCorrect() {
        RussianMultiplicator russianMultiplicator = new RussianMultiplicator();
        int result = russianMultiplicator.multiplicate(47, 42);

        Assertions.assertEquals(1974, result);
    }

    @Test
    void multiplicateExampleIsCorrectV2() {
        RussianMultiplicator russianMultiplicator = new RussianMultiplicator();
        int result = russianMultiplicator.multiplicateV2(47, 42);

        Assertions.assertEquals(1974, result);
    }
}
