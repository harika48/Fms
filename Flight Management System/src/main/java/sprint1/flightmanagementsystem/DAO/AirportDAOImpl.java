package sprint1.flightmanagementsystem.DAO;

import java.util.*;
import java.util.Map.Entry;

import sprint1.flightmanagementsystem.DTO.AirportDTO;

public class AirportDAOImpl implements AirpotDAO 
{
    static public Map<String,AirportDTO> airportEntry; 
    
    public AirportDAOImpl()
    {
    	airportEntry = new HashMap<String, AirportDTO>();
    	
	    airportEntry.put("rga",new AirportDTO("rajiv gandhi","hyd"));
		airportEntry.put("csa",new AirportDTO("chhatrapathishivaji","Mumbai"));
		airportEntry.put("nscb",new AirportDTO("netajiSubash","kolkata"));
    }
		
		public  AirportDTO  viewList(String airportCode) 
		{
		
			AirportDTO a = new AirportDTO();
		    a=airportEntry.get(airportCode);
			return null;
	    }

		public AirportDTO viewList() 
		{
			Set<Entry<String, AirportDTO>> airports = airportEntry.entrySet();
			
			  Iterator<Entry<String,AirportDTO>> x = airports.iterator();
		    
		      for(Entry<String,AirportDTO> entry : airports)
		      {
		        System.out.println("Airport Code : "+entry.getKey() +" "+ "Airport Details : "+entry.getValue());
			  }
			return null;
		}
}
