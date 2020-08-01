package school.cesar.eta.unit.utils;

import org.junit.jupiter.api.Assertions;
import school.cesar.eta.unit.BodyMassIndex;

public class BodyMassIndexMock extends BodyMassIndex {

    public double bmiValue;

    @Override
    public double calculate(double weight, double height) {
        return 50;
    }

    @Override
    public String classify(double bmi) {
        bmiValue = bmi;
        return "new";
    }
}
