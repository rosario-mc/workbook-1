package week5.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    Hotel hotel;

    @BeforeEach
    void setUp(){
        hotel = new Hotel("Motel 8", 40, 150, 15,50);
    }

    @Test
    void getName() {
        assertEquals("Motel 8", hotel.getName());
    }

    @Test
    void getNumberOfSuites() {
        assertEquals(40, hotel.getNumberOfSuites());
    }

    @Test
    void getNumberOfRooms() {
        assertEquals(150, hotel.getNumberOfRooms());
    }

    @Test
    void getBookedSuites() {
        assertEquals(15, hotel.getBookedSuites());
    }

    @Test
    void getBookedBasicRooms() {
        assertEquals(50, hotel.getBookedBasicRooms());
    }

    @Test
    void bookRoomSucceedsWhenEnoughSuitesAvailable() {
        assertTrue(hotel.bookRoom(5, true)); //
    }

    @Test
    void bookRoomFailsWhenNotEnoughSuitesAvailable() {
        assertFalse(hotel.bookRoom(30, true));
    }

    @Test
    void bookRoomSucceedsWhenEnoughBasicRoomsAvailable() {
        assertTrue(hotel.bookRoom(10, false));
    }

    @Test
    void bookRoomFailsWhenNotEnoughBasicRoomsAvailable() {
        assertFalse(hotel.bookRoom(120, false));
    }


    @Test
    void getAvailableRooms() {
        assertEquals(100, hotel.getAvailableRooms());
    }

    @Test
    void getAvailableSuites() {
        assertEquals(25, hotel.getAvailableSuites());
    }
}