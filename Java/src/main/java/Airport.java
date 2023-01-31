import planes.ExperimentalPlane;
import models.ClassificationLevel;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;

import java.util.*;


public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() { return planes;}

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaximumPassengersCapacity() {
        PassengerPlane planeWithMaximumCapacity = getPassengerPlanes().get(0);
        for (PassengerPlane passengerPlane : getPassengerPlanes()) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaximumCapacity.getPassengersCapacity()) {
                planeWithMaximumCapacity = passengerPlane;
            }
        }
        return planeWithMaximumCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : getMilitaryPlanes()) {
            if (plane.getMilitaryType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : getMilitaryPlanes()) {
            if (plane.getMilitaryType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public List<ExperimentalPlane> getExperimentalUnclassifiedPlanes() {
        List<ExperimentalPlane> experimentalUnclassifiedPlane = new ArrayList<>();

        for (ExperimentalPlane experimentalPlane : getExperimentalPlanes()) {

            if (experimentalPlane.getClassificationLevel() == ClassificationLevel.UNCLASSIFIED) {
                experimentalUnclassifiedPlane.add(experimentalPlane);
            }
        }
        return experimentalUnclassifiedPlane;
    }

    public Airport sortByMaximumDistance() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaximumFlightDistance() - o2.getMaximumFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaximumSpeed() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaximumSpeed() - o2.getMaximumSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaximumLoadCapacity() {
        planes.sort(new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaximumLoadCapacity() - o2.getMaximumLoadCapacity();
            }
        });
        return this;
    }


    @Override
    public String toString() {
        return "Airport{" + "Planes=" + planes.toString() + "}";
    }



}
