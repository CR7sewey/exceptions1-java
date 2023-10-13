package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.entities.Reservation2;
import model.exceptions.DomainException;

public class Program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SOLUCAO BOA!!!!!!! --> Tratamos excecoes!!

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next()); // texto --> converte em data
			System.out.print("Check out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next()); // texto --> converte em data
	
			Reservation2 res = new Reservation2(number, checkin, checkout);
			System.out.println("Resercation: " + res);
			System.out.println();
	
			System.out.print("ENter data to update the res: : ");
			System.out.print("Check in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next()); // texto --> converte em data
			System.out.print("Check out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next()); // texto --> converte em data
	
			
			res.updateDates(checkin, checkout);
			
			// corta aqui!! se exception
			System.out.println("Rservation: "+res);
		}
		catch (ParseException e) {
			System.out.print("Invalid date format!");
		}
		catch (DomainException e) {  // ja apanha as excecoes do contrustor e do update dates!
			System.out.print("Error in reservation: "+e.getMessage());
		}
		catch (RuntimeException e) {  
			System.out.print("Unexpected error"); // exemplo no int meter um aaa
		}
		
		
	}

}
