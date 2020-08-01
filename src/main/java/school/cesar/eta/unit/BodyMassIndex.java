package school.cesar.eta.unit;

public class BodyMassIndex {

    public static double calculate(double weight, double height){
        return weight / Math.pow(height, 2);
    }

    public static String classify(double bmi) {
        String category = "Severely Underweight";

        if(bmi >= 30) {
            return "Obese";
        }
        if(bmi >= 25) {
            return "Overweight";
        }
        if(bmi >= 18.5) {
            return "Healthy Weight";
        }
        if(bmi >= 16) {
            return "Underweight";
        }
        return category;
    }

    public static String classify(double weight, double height){
        double bmi = calculate(weight, height);
        return classify(bmi);
    }
}
