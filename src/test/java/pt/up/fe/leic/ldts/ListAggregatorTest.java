package pt.up.fe.leic.ldts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    @Test
    public void testSum() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void testMax() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void testMin() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void testDistinct() {
        List<Integer> list = Arrays.asList(1,2,4,2,5);

        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }
}
