package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import main.Car;
import main.Motorcycle;
import main.Vehicle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    private Car car_test;
    private Motorcycle moto_test;

    @BeforeEach
    public void setUp() {
        car_test = new Car("Reno", "Symbol", 2016);
        moto_test = new Motorcycle("Yamaha", "MT-10SP", 2023);
    }

    // - Проверить, что экзе
    // мпляр объекта Car
    // также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    @DisplayName("Car is a Vehicle")
    public void carIsInstanceOfVehicle() {
        assertTrue(car_test instanceof Vehicle);
    }

    // - Проверить, что объект Car создается с 4-мя колесами.
    @Test
    @DisplayName("Car has 4 wheels")
    public void carHasFourWheels() {
        assertEquals(4, car_test.getNumWheels());
    }

    // - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    @DisplayName("Motorcycle has 2 wheels")
    public void motoHasTwoWheels() {
        assertEquals(2, moto_test.getNumWheels());
    }

    // - Проверить, что объект Car развивает скорость 60 в режиме 
    // тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Car speed is 60 km/h in test drive mode")
    public void carSpeedTest() {
        car_test.testDrive();
        assertEquals(60, car_test.getSpeed());
    }

    // - Проверить, что объект Motorcycle развивает скорость 75 в режиме 
    // тестового вождения (используя метод testDrive()).
    @Test
    @DisplayName("Motorcycle speed is 75 km/h in test drive mode")
    public void motoSpeedTest() {
        moto_test.testDrive();
        assertEquals(75, moto_test.getSpeed());
    }

    // - Проверить, что в режиме парковки (сначала testDrive, потом park, 
    // т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    @DisplayName("Emulation of parking mode after driving mode for Car")
    public void carStopAfterParking() {
        car_test.testDrive();
        car_test.park();
        assertEquals(0, car_test.getSpeed());
    }

    // - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. 
    // эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    @DisplayName("Emulation of parking mode after driving mode for Motorcycle")
    public void motoStopAfterParking() {
        moto_test.testDrive();
        moto_test.park();
        assertEquals(0, moto_test.getSpeed());
    }

}