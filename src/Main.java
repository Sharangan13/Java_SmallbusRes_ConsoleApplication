import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,false,48));
        buses.add(new Bus(2,true,60));
        buses.add(new Bus(3,false,48));

        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus b:buses) {
            b.displayBusInfo();
        }

        while(userOpt==1) {
            System.out.println("Enter 1 to Book and 0 to exit");
            userOpt = scanner.nextInt();
            if(userOpt == 1) {
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println(booking.passengerName+" your booking is confirmed.");
                }
                else
                    System.out.println(booking.passengerName+" sorry. Bus is full. Try another bus or date.");
            }
        }
    }
}