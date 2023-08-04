public class BmiService {
    public int calculate(double HeightMetres, double WeightKillograms) {
        double bmi;
        bmi = WeightKillograms / (HeightMetres * HeightMetres);
        return (int) bmi;
    }

}
