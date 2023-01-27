package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    private int passengersCapacity;

    public PassengerPlane(String model, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, int passengersCapacity) {
        super(model, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", passengersCapacity=" + passengersCapacity + "}");
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PassengerPlane)) return false;
        PassengerPlane plane = (PassengerPlane) object;
        return super.equals(object) && passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+Objects.hash( passengersCapacity);
    }
}
