package ass1SE;

import org.junit.Test;
import static org.junit.Assert.*;




public class SignToProject extends Tester {

	@Test
	public void testOrderShow () {
		
		//green test for 
		assertTrue (sign(203850029,"Ami Haufman")); // correct input 
		//red test for 
		assertFalse (sign(2038500,"Ami Haufman")); // invalid id 
		//red test for 
		assertFalse (sign(203850029,"Leo Messi")); // chief project doesn't exist
		
	}

}
