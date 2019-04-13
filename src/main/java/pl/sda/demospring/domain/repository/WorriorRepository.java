package pl.sda.demospring.domain.repository;

import org.springframework.stereotype.Repository;
import pl.sda.demospring.domain.Worrior;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class WorriorRepository {

    Map<Integer, Worrior> worriors = new HashMap<>();

    public WorriorRepository() {
    }


    public void createWorrior(String name, int age) {
        Worrior newWorrior = new Worrior(name, age);
        newWorrior.setId(getNewId());
        worriors.put(newWorrior.getId(), newWorrior);
    }

    private int getNewId() {
        if (worriors.isEmpty()) {
            return 0;
        } else {
            Optional<Integer> opt = worriors.keySet().stream().max(Integer::max);
            Integer res = opt.get();
            return res + 1;
        }


    }

    public Collection<Worrior> getAllWorriors() {
        return worriors.values();
    }

    public Optional<Worrior> getWorrior(String name) {
        Optional<Worrior> worriorByName = worriors.values()
                .stream()
                .filter(worrior -> worrior.getName().equals(name))
                .findAny();
        return worriorByName;
    }

    public void deleteWorrior(Integer id) {
        worriors.remove(id);
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
        createWorrior(worrior.getName(), worrior.getAge());
    }

    public Worrior getWorriorById(Integer id) {
        return worriors.get(id);
    }
}
