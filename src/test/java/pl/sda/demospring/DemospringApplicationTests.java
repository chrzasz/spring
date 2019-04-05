package pl.sda.demospring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.sda.demospring.domain.Castle;
import pl.sda.demospring.domain.Worrior;

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
	Castle castle;

	@Test
	public void testCastle() {
		String expected = "Castle{name='White Tower', worrior=Worrior{name='Greg', age=18, quest=Quest{description='default quest'}}}";
		assertEquals(expected, castle.toString());
	}

}
