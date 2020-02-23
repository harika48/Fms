package sprint1.flightmanagementsystem.DTO;

public class AirportDTO {
	private String airportName;
	private String airportCode;
	private String airportLocation;
	
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	
	 @Override
	public String toString() {
		return "AirportDTO [airportName=" + airportName + ", airportLocation=" + airportLocation + "]";
	}
	public AirportDTO(String airportName,String airportLocation)
	    {
		 super();
		 this.airportCode = airportCode;
	       this.airportName=airportName;
	       this.airportLocation=airportLocation;
	    }
	 
	 public AirportDTO() {
		
		 super();
	}
	

}
