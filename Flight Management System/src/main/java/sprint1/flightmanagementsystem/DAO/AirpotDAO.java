package sprint1.flightmanagementsystem.DAO;

import java.util.ArrayList;

import sprint1.flightmanagementsystem.DTO.AirportDTO;

public interface AirpotDAO 
{	 
	 public  AirportDTO  viewList(String airportCode);
	 
	 public AirportDTO viewList();
}