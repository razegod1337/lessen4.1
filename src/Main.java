public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double HeightMetres = 1.87;
        double WeightKillograms = 98;
        double bmi = service.calculate(HeightMetres, WeightKillograms);
        System.out.println(bmi);
    }
}