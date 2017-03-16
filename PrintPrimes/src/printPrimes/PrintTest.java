package printPrimes;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class PrintTest {

     public Print print;
    
	@Before
	public void setUp() throws Exception {		
	    print = new Print();
        
	}
	@Test
	public void test() throws IOException {
		assertEquals(print.printPrimes(3),"Prime: 2 3 5 ");
		
	}

}
