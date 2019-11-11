package rocks.zipcode.assessment2.generics.shelter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.generics.Shelter;

import java.util.Collection;

public class ShelterPolymorphismTest {
    @Test
    public void test1() {
        Shelter shelter = new Shelter();
        Assert.assertFalse(shelter instanceof Collection);
    }

    @Test
    public void test2() {
        Shelter shelter = new Shelter();
        Assert.assertTrue(shelter instanceof Iterable);
    }
}
