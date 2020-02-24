package sprint1.flightmanagementsystem;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import sprint1.flightmanagementsystem.DAO.AirportDAOImpl;
import sprint1.flightmanagementsystem.DTO.AirportDTO;
import sprint1.flightmanagementsystem.Service.AirportException;
import sprint1.flightmanagementsystem.Service.AirportService;

public class MainUI 
{
	public static void main(String[] args) {
		try {
		String airportName;
		String airportCode;
		String airportLocation;
		int ch=0;
		Scanner s =new Scanner(System.in);
		AirportService service= new AirportService();
		AirportDAOImpl  dao =new  AirportDAOImpl();
		while(ch!=3)
		{
		System.out.println("1.View the Airport details by AirportCode");
		System.out.println("2.View the list of Airports");
		System.out.println("3.exit");
		System.out.print("Enter Your Choice : ");
		try
		{
			ch=s.nextInt();
			s.nextLine();
		}
		catch(Exception e) {
			System.err.println("Please enter correct Choice");
			s.nextLine();
		}
			switch(ch)
			{
		    case 1:
		    	try{
			    	System.out.println("Enter the AirportCode to view the details");
			    	airportCode = s.next();
						AirportDTO a = dao.airportEntry.get(airportCode);
						if(dao.isValid(airportCode)==true){
			  		  System.out.println("Airport details of code "+airportCode+" are \nAirport Name : "+a.getAirportName()+"\nAirport Location : "+a.getAirportLocation());
						}
						else{
							throw new AirportException("Entered airport code is not available please try with another code");
						}
			    }
			    catch(Exception e){
			    	System.out.println(e.getMessage());
			    }
				break;
		    case 2:
				   service.viewList();
			       break;
			case 3: 
				System.out.println("Exit");
			break;
			default:System.out.println("Invalid option");
			}
			
			}
		}
		catch(InputMismatchException e) {
			System.out.println("");
		}
		
	}}

