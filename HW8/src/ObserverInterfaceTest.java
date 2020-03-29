import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public abstract class ObserverInterfaceTest {
	private static int eventNumber;
	private static int eventData;
	
	private static final Event e = new Event(eventNumber,eventData);

	public abstract ObserverInterface createInstance();
	
	ObserverInterface obi;

	@Before
	public void setUp() throws Exception {
		obi = createInstance();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(obi.notifyObserver(e));
	}
}
