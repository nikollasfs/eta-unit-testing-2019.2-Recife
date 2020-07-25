package school.cesar.eta.unit;

public class BodyMassIndex {
    public static String calculate(float bmi) {

        if(bmi >= 30f) {
            return "Obese";
        }

        if(bmi >= 25f) {
            return "Overweight";
        }

        if(bmi >= 18.5f) {
            return "Healthy Weight";
        }

        if(bmi >= 16f) {
            return "Underweight";
        }

        return "Severely Underweight";
    }
}
