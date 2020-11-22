package CourseWork2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bookingSystem {
	private static final String Seat="seats.txt"; //where your file located
	private static final Scanner input = new Scanner (System.in);
	
	
	
	private static final Seat[] Seats = new Seat[18];

	public static void main(String[] args)  throws Exception{
		loadSeats();
		String choice = "";
		System.out.println("- - Seat Booking System - - \n");
		
		do {
		
			System.out.println("- - MAIN MENU - - \n");
			System.out.println("1 - Reserve Seat ");
			System.out.println("2 - Cancel Seat ");
			System.out.println("3 - View Seat Reservations ");
			System.out.println("Q - Quit ");
			System.out.print("Pick : ");
			
			choice = input.next().toUpperCase();
			
			switch (choice) {
			case "1" : {
				reserveSeats();
				break;
			}
			case "2" : {
				cancelSeat();
				break;
			}
			case "3" : {
				viewSeatreservation();
				break;
			}
			
			}
		
	} while (!choice.equals("Q"));
		System.out.println("-- GOODBYE --");
		input.close();
	
	}
	
	private static void loadSeats() throws FileNotFoundException{
		Scanner file = new Scanner (new FileReader("C:\\Users\\rayan\\Desktop\\Data\\Seats.txt"));
		int index=0;
			
			while (file.hasNext()) {
				
				String seatNum = file.next();
				String seatClass = file.next();
				boolean isWindow = Boolean.parseBoolean(file.next());
				boolean isAisle = Boolean.parseBoolean(file.next());
				boolean isTable = Boolean.parseBoolean(file.next());
				double seatPrice = Double.parseDouble(file.next());
				String eMail = file.next();
				
				Seats[index] = new Seat(seatNum, seatClass, isWindow, isAisle,
				isTable, seatPrice, eMail);
				index++;
		
	}
			file.close();	
			
			}
	
	
	
	
	private static void reserveSeats() {
		System.out.println("Reserve Available Seat");
		
		for (int i=0; i<Seats.length; i++) {
			System.out.println(Seats[i].toString());
		}
		
		System.out.println("Do you want the seat First or Second Class? ");
		String seatClass = input.next();
		
		
		
	
		
	
	}
	
	private static void cancelSeat() {
		System.out.println("Please put your eMail to cancel the transaction!");
		String eMail = input.next();
		
		
	}
	
	private static void viewSeatreservation() {
	}
	
	
}
