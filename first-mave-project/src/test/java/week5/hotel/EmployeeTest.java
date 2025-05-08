package week5.hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("Rosario", "123456", "Front Desk", 20.36, 45);
    }

    @Test
    void getName() {
        assertEquals("Rosario", employee.getName());
    }

    @Test
    void setName() {
        employee.setName("Alexa");
        assertEquals("Alexa", employee.getName());
    }

    @Test
    void getEmployeeID() {
        assertEquals("123456", employee.getEmployeeID());
    }

    @Test
    void setEmployeeID() {
        employee.setEmployeeID("456789");
        assertEquals("456789", employee.getEmployeeID());
    }

    @Test
    void getDepartment() {
        assertEquals("Front Desk", employee.getDepartment());
    }

    @Test
    void setDepartment() {
        employee.setDepartment("Human Resources");
        assertEquals("Human Resources", employee.getDepartment());
    }

    @Test
    void getPayRate() {
        assertEquals(20.36, employee.getPayRate());
    }

    @Test
    void setPayRate() {
        employee.setPayRate(30.56);
        assertEquals(30.56, employee.getPayRate());
    }

    @Test
    void getHoursWorked() {
        assertEquals(45, employee.getHoursWorked());
    }

    @Test
    void setHoursWorked() {
        employee.setHoursWorked(56);
        assertEquals(56, employee.getHoursWorked());
    }

    @Test
    void getRegularHours() {
        assertEquals(40, employee.getRegularHours());
    }

    @Test
    void getOvertimeHours() {
        assertEquals(5, employee.getOvertimeHours());
    }

    @Test
    void getTotalPay() {
        assertEquals(967.10, employee.getTotalPay(), 0.01);
    }

    @Test
    void punchInAndOutWithGivenTimeUpdatesHoursWorked() {
        employee.punchIn(8.0);
        employee.punchout(16.0);
        assertEquals(53, employee.getHoursWorked());
    }

    @Test
    void testPunchIn() {
        double expectedStartTime = 12;
        assertEquals(expectedStartTime, employee.getStartTime);
    }

    @Test
    void testPunchout() {
        double expectedHoursWorked = 12;
        employee.punchIn(10);
        employee.punchout(22);
        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
}
