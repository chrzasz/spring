package pl.sda.demospring.domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WorriorTest {

    @Test
    public void questAssignedIsStarted() {
        Worrior worrior = new Worrior("John", 22);
        Quest quest = new Quest("Test quest");
        worrior.setQuest(quest);
        assertTrue(worrior.getQuest().isStarted());
    }
}