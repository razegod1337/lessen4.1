public class BmiService {
    public int calculate(double heightMetres, double weightKillograms) {
        double bmi;
        bmi = weightKillograms / (heightMetres * heightMetres);
        return (int) bmi;
    }

}
