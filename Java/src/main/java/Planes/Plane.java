package Planes;

import java.util.Objects;

abstract public class Plane {
    private String model;
    private int maximumSpeed;
    private int maximumFlightDistance;
    private int maximumLoadCapacity;

    public Plane(String model, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity) {
        this.model = model;
        this.maximumSpeed = maximumSpeed;
        this.maximumFlightDistance = maximumFlightDistance;
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public int getMaximumFlightDistance() {
        return maximumFlightDistance;
    }

    public int getMaximumLoadCapacity() { return maximumLoadCapacity; }

    @Override
    public String toString() {
        return "Plane{" +
                "model=" + model +
                ", maximumSpeed=" + maximumSpeed +
                ", maximumFlightDistance=" + maximumFlightDistance +
                ", maximumLoadCapacity=" + maximumLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Plane)) return false;
        Plane plane = (Plane) object;
        return maximumSpeed == plane.getMaximumSpeed() &&
                maximumFlightDistance == plane.getMaximumFlightDistance() &&
                maximumLoadCapacity == plane.getMaximumLoadCapacity() &&
                model == plane.getModel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
    }
}
