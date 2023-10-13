package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// SOLUCAO MUITO MA!!!!!!!
		// isto pq nao apanha excecoes (so no metodo main) e a validacao devia de estar na lcasse reservation
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check in date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next()); // texto --> converte em data
		System.out.print("Check out date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next()); // texto --> converte em data

		if (!checkout.after(checkin)) {
			System.out.println("Error in reservations: Check-out date must be after check in date!");
		}
		else {
			Reservation res = new Reservation(number,checkin,checkout);
			System.out.println("Resercation: " + res);
			System.out.println();
			
			System.out.print("ENter data to update the res: : ");
			System.out.print("Check in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next()); // texto --> converte em data
			System.out.print("Check out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next()); // texto --> converte em data
			
			Date now = new Date();
			if (!checkout.after(checkin)) {
				System.out.println("Error in reservations: Check-out date must be after check in date!");
			}
			else if (checkin.before(now) || checkout.before(now) ) {
				System.out.println("Error in reservations: Dates must be after now!!!");
			}
			else {
				res.updateDates(checkin, checkout);
				System.out.println("Resercation: " + res);
				
			}
			
		}
		
	}

}
