package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void classify_bmiUnder16_severelyUnderweight() {
        String actual = BodyMassIndex.classify(15.9f);
        Assertions.assertEquals("Severely Underweight", actual);
    }

    @Test
    public void classify_bmi16_underweight() {
        String actual = BodyMassIndex.classify(16f);
        Assertions.assertEquals("Underweight", actual);
    }

    @Test
    public void classify_18Dot5_healthyWeight() {
        String actual = BodyMassIndex.classify(18.5f);
        Assertions.assertEquals("Healthy Weight", actual);
    }

    @Test
    public void classify_bmi25_overweight() {
        String actual = BodyMassIndex.classify(25f);
        Assertions.assertEquals("Overweight", actual);
    }

    @Test
    public void classify_bmi30_obese() {
        String actual = BodyMassIndex.classify(30f);
        Assertions.assertEquals("Obese", actual);
    }






}
