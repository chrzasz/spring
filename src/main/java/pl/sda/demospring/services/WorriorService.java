package pl.sda.demospring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.demospring.domain.Worrior;
import pl.sda.demospring.domain.repository.WorriorRepository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class WorriorService {

    @Autowired
    WorriorRepository worriorRepository;

    public List<Worrior> getAllWorriors() {
        return new ArrayList<>(worriorRepository.getAllWorriors());
    }

    public void saveWorrior(Worrior worrior) {
        worriorRepository.createWorrior(worrior);
    }

    public Worrior getWorrior(Integer id) {
        return worriorRepository.getWorriorById(id);
    }

    public void deleteWorrior(Integer id) {
        worriorRepository.deleteWorrior(id);
    }
}
