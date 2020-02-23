package sprint1.flightmanagementsystem.Service;

import java.util.ArrayList;

import sprint1.flightmanagementsystem.DAO.AirportDAOImpl;
import sprint1.flightmanagementsystem.DTO.AirportDTO;

public class AirportService 
{
	AirportDAOImpl dao = new AirportDAOImpl();
	
	 public AirportDTO getAirportDetails(String airportCode) 
	  { 
		  AirportDTO a = dao.getAirportDetails(airportCode);
		  return a;
	  }

	  public AirportDTO viewList() 
	  {
			AirportDTO b = dao.viewList();
			return b;
			
	  }
		


	
	

	 
	 }


