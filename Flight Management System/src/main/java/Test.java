import java.util.Map;

import junit.framework.TestCase;
import sprint1.flightmanagementsystem.DAO.AirportDAOImpl;
import sprint1.flightmanagementsystem.DTO.AirportDTO;

public class Test extends TestCase {
	 static public Map<String,AirportDTO> airportEntry; 
	 AirportDAOImpl t=new  AirportDAOImpl();
	 public void test() {
		 assertEquals(null, t.getAirportDetails("rga"));
	 }
	 public void test1() {
		 assertEquals(null,t.viewList());
	 }

}

