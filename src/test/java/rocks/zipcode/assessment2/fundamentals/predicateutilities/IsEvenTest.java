package rocks.zipcode.assessment2.fundamentals.predicateutilities;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.PredicateUtilities;

public class IsEvenTest {
    @Test
    public void test1() {
        test(0, true);
    }

    @Test
    public void test2() {
        test(1, false);
    }

    @Test
    public void test3() {
        test(2, true);
    }

    @Test
    public void test4() {
        test(3, false);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isEven(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
