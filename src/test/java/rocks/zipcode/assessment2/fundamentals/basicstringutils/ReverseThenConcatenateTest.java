package rocks.zipcode.assessment2.fundamentals.basicstringutils;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.fundamentals.BasicStringUtils;

public class ReverseThenConcatenateTest {
    @Test
    public void test1() {
        test("The", "Quick", "ehTkciuQ");
    }

    @Test
    public void test2() {
        test("Brown", "Fox", "nworBxoF");
    }

    @Test
    public void test3() {
        test("Jumps", "Over", "spmuJrevO");
    }


    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = BasicStringUtils.reverseThenConcatenate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
