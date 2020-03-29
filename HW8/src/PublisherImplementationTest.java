import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PublisherImplementationTest {

	PublisherImplementation pub;
	ObserverInterface O;
	List<ObserverInterface> subscribers = new ArrayList<ObserverInterface>();
	@Before
	public void setUp() throws Exception {
		pub = new PublisherImplementation();
		
	}

	@After
	public void tearDown() throws Exception {
		pub = null;
	}

	@Test
	public void testForAdding() {
		assertEquals(pub.registerObserver(O),"The observer is added");
	}
	
	@Test
	public void testForRemoval() {
		assertEquals(pub.removeObserver(O),"Observer Removed");
	}
	

}
