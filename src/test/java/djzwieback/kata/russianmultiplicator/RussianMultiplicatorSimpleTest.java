package djzwieback.kata.russianmultiplicator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RussianMultiplicatorSimpleTest {

    @Test
    void mul() {
        RussianMultiplicatorWithList russianMultiplicatorWithList = new RussianMultiplicatorWithList();
        int result = russianMultiplicatorWithList.mul(47, 42);

        Assertions.assertEquals(1974, result);
    }
}
