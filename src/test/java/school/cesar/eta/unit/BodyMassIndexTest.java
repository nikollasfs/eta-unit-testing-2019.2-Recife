package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void calculate_bmiUnder16_severelyUnderweight() {
        String actual = BodyMassIndex.calculate(15.9f);
        Assertions.assertEquals("Severely Underweight", actual);
    }

    @Test
    public void calculate_bmi16_underweight() {
        String actual = BodyMassIndex.calculate(16f);
        Assertions.assertEquals("Underweight", actual);
    }

    @Test
    public void calculate_18Dot5_healthyWeight() {
        String actual = BodyMassIndex.calculate(18.5f);
        Assertions.assertEquals("Healthy Weight", actual);
    }

    @Test
    public void calculate_bmi25_overweight() {
        String actual = BodyMassIndex.calculate(25f);
        Assertions.assertEquals("Overweight", actual);
    }

    @Test
    public void calculate_bmi30_obese() {
        String actual = BodyMassIndex.calculate(30f);
        Assertions.assertEquals("Obese", actual);
    }






}
