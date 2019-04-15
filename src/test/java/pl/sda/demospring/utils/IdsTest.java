package pl.sda.demospring.utils;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class IdsTest {

    @Test
    public void emptySetTest() {
        int res = Ids.getNewId(Collections.emptySet());
        assertEquals(0, res);
    }

    @Test
    public void generateNewIdTest() {
        Set<Integer> sample = new HashSet<>();
        sample.add(1);
        sample.add(2);
        sample.add(3);
        int res = Ids.getNewId(sample);
        assertEquals(4, res);
    }

}