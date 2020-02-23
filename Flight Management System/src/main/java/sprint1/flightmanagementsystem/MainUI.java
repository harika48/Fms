package sprint1.flightmanagementsystem;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import sprint1.flightmanagementsystem.DAO.AirportDAOImpl;
import sprint1.flightmanagementsystem.DTO.AirportDTO;
import sprint1.flightmanagementsystem.Service.AirportService;

public class MainUI 
{
	public static void main(String[] args) {
		String airportName;
		String airportCode;
		String airportLocation;
		int ch,ch1=1;
		Scanner s =new Scanner(System.in);
		AirportService service= new AirportService();
		AirportDAOImpl  dao =new  AirportDAOImpl();
		System.out.println("1.View the Airport details by AirportCode");
		System.out.println("2.View the list of Airports");
		System.out.print("Enter Your Choice : ");
		while(ch1!=0)
		{
			ch=s.nextInt();
			switch(ch)
			{
		    case 1:
		    	System.out.println("Enter the AirportCode to view the details");
		    	airportCode = s.next();
		    	//AirportDTO a = service.getAirportDetails(airportCode);
					 AirportDTO a = dao.airportEntry.get(airportCode);
		  		  System.out.println("Airport details of code "+airportCode+" are \nAirport Name : "+a.getAirportName()+"\nAirport Location : "+a.getAirportLocation());
		    	
			break;
		
		    case 2:
				   service.viewList();
			       }
			}
		
	}}

