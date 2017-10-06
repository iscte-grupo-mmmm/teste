package esi;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		assertEquals("Sample2", new App().sample());
		assertEquals("Mike Sample", new App().sampleMike());
		assertEquals("OutSystems dude - Is that a game?", new App().sampleMiguel());
	}

}
