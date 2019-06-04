package ass1SE;

import org.junit.Test;
import static org.junit.Assert.*;



public class AddProject extends Tester {

	@Test
	public void testOrderShow () {
		
		//green test for 
		assertTrue (AddNewProject("Racer","multyplayer car racing game",60,"Doctor Ford","EA SPORTS")); // Great input
		//red test for 
		assertFalse (AddNewProject("Racer","multyplayer car racing game",60,"Doktor Ford","EA SPORTS")); // spelling is wrong 
		//red test for 
		assertFalse (AddNewProject("","multyplayer car racing game",60,"Doctor Ford","EA SPORTS")); // part of input is empty '-'
		
		
	}

}
