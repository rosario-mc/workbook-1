package week5.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room room;

    @BeforeEach
    void setUp() {
        room = new Room(4, 124.00, true, true);
    }

    @Test
    void getNumberOfBeds() {
        assertEquals(4, room.getNumberOfBeds());
    }

    @Test
    void setNumberOfBeds() {
        room.setNumberOfBeds(3);
        assertEquals(3, room.getNumberOfBeds());
    }

    @Test
    void getRoomPrice() {
        assertEquals(124.00, room.getRoomPrice());
    }

    @Test
    void setRoomPrice() {
        room.setRoomPrice(154.00);
        assertEquals(154.00, room.getRoomPrice());
    }

    @Test
    void isOccupied() {
        assertTrue(room.isOccupied());
    }

    @Test
    void setOccupied() {
        room.setOccupied(false);
        assertFalse(room.isOccupied());
    }

    @Test
    void isDirty() {
        assertTrue(room.isDirty());
    }

    @Test
    void setDirty() {
        room.setDirty(false);
        assertFalse(room.isDirty());
    }

    @Test
    void checkInToDirtyRoomShouldFail() {
        Room room = new Room(2, 100, false, true);
        room.checkIn();
        assertFalse(room.isOccupied());
    }

    @Test
    void checkInToCleanRoomShouldSucceed() {
        Room room = new Room(2, 100, false, false);
        room.checkIn();
        assertTrue(room.isOccupied());
    }

    @Test
    void checkout() {
        Room room = new Room(2, 100, true, true);
        room.checkout();
        assertFalse(room.isOccupied());
    }

    @Test
    void cleanRoom() {
        Room room = new Room(2, 100, false, true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }
}