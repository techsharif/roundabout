import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    @Test
    @DisplayName("Sum(1,3) should return 6")
    void computeSmallSum() {
        Sum sum = new Sum(1, 3);
        sum.compute();

        assertEquals(6, sum.getSum());
    }

    @Test
    @DisplayName("Sum(3, 1) should return 0")
    void computeSumWithGreaterStartThanEnd() {
        Sum sum = new Sum(3, 1);
        sum.compute();

        assertEquals(0, sum.getSum());
    }
}