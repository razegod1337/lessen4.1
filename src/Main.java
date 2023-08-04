public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetres = 1.87;
        double weightKillograms = 98;
        double bmi = service.calculate(heightMetres, weightKillograms);
        System.out.println(bmi);
    }
}
