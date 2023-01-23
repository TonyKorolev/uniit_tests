package seminars.second.hw;

import org.junit.jupiter.api.Test;
import homeworks.hw2.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Lada", "Vesta", 2016);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumWheelsEqualTo4() {
        Car car = new Car("Lada", "Vesta", 2016);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotoNumWheelsEqualTo4() {
        Motorcycle motorcycle = new Motorcycle("Dodge", "Tomahawk", 2018);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarSpeedTestDrive() {
        Car car = new Car("Lada", "Vesta", 2016);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotoSpeedTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Dodge", "Tomahawk", 2018);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarSpeedPark() {
        Car car = new Car("Lada", "Vesta", 2016);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotoSpeedPark() {
        Motorcycle motorcycle = new Motorcycle("Dodge", "Tomahawk", 2018);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}