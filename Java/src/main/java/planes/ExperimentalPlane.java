package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(model, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){ this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getExperimentalTypes() { return experimentalTypes;}

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ExperimentalPlane)) return false;
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) object;
        return super.equals(object) && experimentalTypes == experimentalPlane.getExperimentalTypes() && classificationLevel == experimentalPlane.getClassificationLevel();

    }

    @Override
    public int hashCode() {
        return super.hashCode()+ Objects.hash(experimentalTypes, classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",", ExperimentalType: "+ experimentalTypes + ", ClassificationLevel: " + classificationLevel + " }");
    }
}
