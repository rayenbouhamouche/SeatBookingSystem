package CourseWork2;

import java.text.DecimalFormat;

public class Seat {
	
	private String seatNum;
	private String seatClass;
	private boolean isWindow;
	private boolean isAisle;
	private boolean isTable;
	private double seatPrice;
	private String eMail;
	
	
	
	public Seat(String seatNum, String seatClass, boolean isWindow,boolean isAisle, boolean isTable, double seatPrice ,String eMail) {
		this.seatNum = seatNum;
		this.seatClass = seatClass;
		this.isWindow = isWindow;
		this.isTable = isTable;
		this.seatPrice = seatPrice;
		this.eMail = eMail;
	
	}
	public String toString() {
		DecimalFormat decimalF = new DecimalFormat("#.00");
		
		String result= "Seat Number: " + seatNum + " "  + seatClass +" Window Seat? " +  isWindow + " Aisle Seat? " + isAisle 
				+ " Table Seat? " + isTable +" "+ decimalF.format(seatPrice) +" " + eMail ;
		return result;
		
		}
		
	
	 
	public boolean isReserve() {
		return eMail != "" ? true : false;
		}
	
	public void reserveSeat(String eMail) throws Exception {
		if (!isReserve()) {
			this.eMail=eMail;
		}
		else {
			throw new Exception("This seat is already been reserved :(");
		}
	}
	
	
	
	public void cancelSeat(String eMail) throws Exception {
		if(eMail.equalsIgnoreCase(this.eMail)) {
			this.eMail="";
		}
		else {
			throw new Exception("eMail invalid");
		}
	}
	

	public String getSeatNum() {
		return seatNum;
	}
	
	public String getSeatClass() {
		return seatClass;
	}
	
	public boolean isWindow() {
		return isWindow;
	}
	
	public boolean isAisle() {
		return isAisle;
	}
	
	public boolean isTable() {
		return isTable;
	}
	
	public double getSeatPrice() {
		return seatPrice;
	}
	
	public String getEmail() {
		return eMail;
	}
}
	
	
