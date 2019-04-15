package pl.sda.demospring.utils;

import java.util.Set;

public class Ids {

    static public int getNewId(Set<Integer> keysSoFar) {
        if (keysSoFar.isEmpty()) {
            return 0;
        } else {
            Integer res = keysSoFar.stream().max((o1, o2) -> o1.compareTo(o2)).get();
            return res + 1;
        }
    }
}
