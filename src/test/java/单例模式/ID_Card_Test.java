package 单例模式;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ID_Card_Test {
	@Test
	public void ID_e_Test() {
		single_case.e.ID_Card id = single_case.e.ID_Card.getInstance();
		id.setString_id("123445");
		assertEquals(single_case.e.ID_Card.getInstance(), id);
		assertEquals(1, 2);
	}
	
	@Test
	public void ID_l_Test() {
		single_case.l.ID_Card id = single_case.l.ID_Card.getInstance();
		id.setString_id("1234456");
		assertEquals(single_case.l.ID_Card.getInstance(), id);
	}
}
