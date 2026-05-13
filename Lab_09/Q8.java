package Lab_09;
class MovieSeatBooking {
    int totalSeats = 5;
    synchronized void bookSeat(int seats) {
        System.out.println(Thread.currentThread().getName()
                + " trying to book " + seats + " seats");
        if (totalSeats >= seats) {
            totalSeats -= seats;
            System.out.println(seats + " Seats Booked Successfully");
            System.out.println("Seats Left: " + totalSeats);
        } else {
            System.out.println("Seats Not Available");
            System.out.println("Seats Left: " + totalSeats);
        }
    }
}
class BookingThread extends Thread {
    MovieSeatBooking b;
    int seats;
    BookingThread(MovieSeatBooking b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeat(seats);
    }
}
public class Q8 {
    public static void main(String[] args) {
        MovieSeatBooking b = new MovieSeatBooking();
        BookingThread t1 = new BookingThread(b, 2);
        BookingThread t2 = new BookingThread(b, 3);
        BookingThread t3 = new BookingThread(b, 2);
        t1.start();
        t2.start();
        t3.start();
    }
}