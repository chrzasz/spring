package pl.sda.demospring.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.sda.demospring.domain.Quest;
import pl.sda.demospring.domain.repository.QuestRepository;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class QuestServiceTest {

    @Mock
    QuestRepository repoMock;

    @Test
    public void getAllNotStatredQuestTest() {

        List<Quest> questList = new ArrayList<>();
        Quest q1 = new Quest("Test quest 1");
        Quest q2 = new Quest("Test quest 2");
        Quest q3 = new Quest("Test quest 3");

        q2.setStarted(true);

        questList.add(q1);
        questList.add(q2);
        questList.add(q3);

        when(repoMock.getAll()).thenReturn(questList);

        QuestService qs = new QuestService();
        qs.setQuestRepository(repoMock);
        List<Quest> allNotStatredQuests = qs.getAllNotStatredQuest();
        assertEquals("Size of returned quest", 2, allNotStatredQuests.size());
        assertThat(allNotStatredQuests, containsInAnyOrder(q1, q3));

    }
}