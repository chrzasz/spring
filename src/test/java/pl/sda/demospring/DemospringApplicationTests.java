package pl.sda.demospring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.sda.demospring.domain.Worrior;
import pl.sda.demospring.domain.repository.WorriorRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemospringApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	Worrior worrior;

	@Autowired
    WorriorRepository castle;

	@Test
	public void testCastle() {
        String expected = "WorriorRepository{name='White Tower', worrior=Worrior{name='Greg', age=18, quest=Quest{description='default quest'}}}";
		assertEquals(expected, castle.toString());
	}

}
