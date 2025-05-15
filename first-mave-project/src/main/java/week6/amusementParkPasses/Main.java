package week6.amusementParkPasses;

public class Main {
    public static void main(String[] args) {
        GroupBooking booking = new GroupBooking();
        booking.addPass(new AdultPass("Rosario Miller-Canales"));
        booking.addPass(new AdultPass("Myles Miller"));
        booking.addPass(new ChildPass("Santorio Miller-Canales"));
        booking.addPass(new ChildPass("Amado Miller-Canales"));
        booking.addPass(new SeniorPass("Bruce Miller"));
        booking.addPass(new SeniorPass("Rebecca Lesnik"));

        booking.printSummary();
    }
}
