package pl.sda.demospring.domain.repository;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import pl.sda.demospring.domain.Quest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();

    Random rnd = new Random();

    public void createQuest(String description) {
        questList.add(new Quest(description));
    }

    public void deleteQuest(Quest quest) {
        questList.remove(quest);
    }

    public List<Quest> getAll() {
        return questList;
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuests() {
        List<String> descriptions = new ArrayList<>();
        descriptions.add("Save the Queen");
        descriptions.add("Feed horses");
        descriptions.add("Fight");
        descriptions.add("Kill dragon");
        descriptions.add("Kill orc");

        String description = descriptions.get(rnd.nextInt(descriptions.size()));
        System.out.println(description);
        createQuest(description);
    }

    @PostConstruct
    public void init() {

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
