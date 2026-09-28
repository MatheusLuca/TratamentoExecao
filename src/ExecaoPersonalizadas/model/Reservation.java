package ExecaoPersonalizadas.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        // Diff = diferença das datas em milesegundos
        // getTime() retorna o numero em milesegundos
        // diff = diferença entre as datas em milesegundos
        long diff = checkout.getTime() - checkin.getTime();

        // convertendo a diff ms em dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }


    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout  = checkout;
    }

    @Override
    public String toString(){
        return "Room: " + roomNumber + ", check-in: " + sdf.format(checkin) + ", check-out: " + sdf.format(checkout) + ", " +
                duration() + " nights.";
    }

}
