package pl.sda.demospring.domain.repository;

import org.springframework.stereotype.Repository;
import pl.sda.demospring.domain.Quest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();

    public void createQuest(String description) {
        questList.add(new Quest(description));
    }

    public List<Quest> getAll() {
        return questList;
    }

    @PostConstruct
    public void init() {
        createQuest("Save the Queen");
        createQuest("Feed horses");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
