package ExecaoPersonalizadas.solucaoruim.view;

import ExecaoPersonalizadas.model.Reservation;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date: (dd/MM/yyyy)");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check-out date: (dd/MM/yyyy)");
        Date checkout = sdf.parse(sc.next());

        //Metodo da classe date
        // A data de checkout é posterior a data de checkin
        //Se a data de checkout nao for depois da data do check-in
        if(!checkout.after(checkin)){
            System.out.println("Error in reservation: check-out date must be after check-in date!");

        }else{
            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation.toString());

            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date: (dd/MM/yyyy)");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date: (dd/MM/yyyy)");
            checkout = sdf.parse(sc.next());

            Date now = new Date();

            if( checkin.before(now) || checkout.before(now)){
                System.out.println("Error in reservation datas for update must be future!");
            }else if(!checkout.after(checkin)){
                System.out.println("Error in reservation: check-out date must be after check-in date!");
            }else{
                reservation.updateDates( checkin,checkout );
                System.out.println("Reservation: " + reservation.toString());
            }
        }
        sc.close();

    }
}
