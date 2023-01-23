package seminars.second.hw;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import homeworks.hw2.*;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    private Car car = new Car("Lada", "Vesta", 2016);
    private Motorcycle motorcycle = new Motorcycle("Dodge", "Tomahawk", 2018);

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumWheelsEqualTo4() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotoNumWheelsEqualTo4() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarSpeedTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotoSpeedTestDrive() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarSpeedPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotoSpeedPark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}