package pl.sda.demospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.demospring.domain.Worrior;
import pl.sda.demospring.domain.repository.WorriorRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorriorService {

    @Autowired
    WorriorRepository worriorRepository;

    public List<Worrior> getAllWorriors() {
        return new ArrayList<>(worriorRepository.getAllWorriors());
    }

}
