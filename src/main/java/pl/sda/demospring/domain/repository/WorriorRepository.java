package pl.sda.demospring.domain.repository;

import org.springframework.stereotype.Repository;
import pl.sda.demospring.domain.Worrior;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class WorriorRepository {

    Map<String, Worrior> worriors = new HashMap<>();

    public WorriorRepository() {
    }


    public void createWorrior(String name, int age) {
        worriors.put(name, new Worrior(name, age));
    }

    public Collection<Worrior> getAllWorriors() {
        return worriors.values();
    }

    public Worrior getWorrior(String name) {
        return worriors.get(name);
    }

    public void deleteWorrior(String name) {
        worriors.remove(name);
    }

    @PostConstruct
    public void build() {
        createWorrior("Protos", 19);
        createWorrior("Goliat", 20);
        createWorrior("David", 22);
    }


    @Override
    public String toString() {
        return "WorriorRepository{" +
                "worriors=" + worriors +
                '}';
    }

    public void createWorrior(Worrior worrior) {
    }
}
