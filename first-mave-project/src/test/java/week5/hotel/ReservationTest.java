package week5.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    Reservation reservation;

    @BeforeEach
    void setUp() {
        reservation = new Reservation("King", 3, true);
    }

    @Test
    void getRoomType() {
        assertEquals("King", reservation.getRoomType());
    }

    @Test
    void setRoomType() {
        reservation.setRoomType("Double");
        assertEquals("Double", reservation.getRoomType());
    }

    @Test
    void getNumberOfNights() {
        assertEquals(3, reservation.getNumberOfNights());
    }

    @Test
    void setNumberOfNights() {
        reservation.setNumberOfNights(6);
        assertEquals(6, reservation.getNumberOfNights());
    }

    @Test
    void isWeekend() {
        assertTrue(reservation.isWeekend());
    }

    @Test
    void setWeekend() {
        reservation.setWeekend(false);
        assertFalse(reservation.isWeekend());
    }

    @Test
    void getPrice() {
        double price = reservation.getPrice();
        assertEquals(139.00 * 1.1, price, 0.01);
    }

    @Test
    void getReservationTotal() {
        assertEquals(458.70, reservation.getReservationTotal(), 0.01);
    }
}