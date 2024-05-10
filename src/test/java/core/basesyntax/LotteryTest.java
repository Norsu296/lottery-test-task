package core.basesyntax;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LotteryTest {
    private static final Lottery lottery = new Lottery();

    @Test
    public void shouldReturnBallWithRandomColorAndNumber() {
        //given
        //when
        Ball resultBall = lottery.getRandomBall();
        //then
        assertNotNull(resultBall);
        assertNotNull(resultBall.getColor());
        assertTrue(resultBall.getNumber() >= 0 && resultBall.getNumber() < 100);
    }

}