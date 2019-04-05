package pl.sda.demospring.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Worrior worrior = new Worrior();
        worrior.setQuest(quest);
        Castle castle = new Castle("Castle 1", worrior);
        String expected = "Castle{name='Castle 1', worrior=Worrior{name='Greg', age=18, quest=Quest{description='default quest'}}}";
        assertEquals(expected, castle.toString());
    }
}