import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SumRecursiveActionTest {

    @Test
    void checkTimeDifference() {
        LocalDateTime start = LocalDateTime.now();
        Sum sum = new Sum(1, 20000);
        sum.compute();
        LocalDateTime end = LocalDateTime.now();

        Long diffSum = ChronoUnit.MICROS.between(start, end); // 10185666
        System.out.println("diffSum " + diffSum);

        start = LocalDateTime.now();
        SumRecursiveAction sumRecursiveAction = new SumRecursiveAction(1, 20000);
        sumRecursiveAction.compute();
        end = LocalDateTime.now();

        Long diffSumRecursiveAction = ChronoUnit.MICROS.between(start, end); // 2077664
        System.out.println("diffSumRecursiveAction " + diffSumRecursiveAction);

        assertTrue(diffSum > diffSumRecursiveAction);
    }

    @Test
    void checkSum() {

        Sum sum = new Sum(1, 10000);
        sum.compute();

        SumRecursiveAction sumRecursiveAction = new SumRecursiveAction(1, 10000);
        sumRecursiveAction.compute();

        assertEquals(sum.getSum(), sumRecursiveAction.getSum());
    }

}