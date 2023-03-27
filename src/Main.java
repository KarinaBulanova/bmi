public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 150;
        double height = 1.87;
        int bmi = service.calculate(height, weight);

        System.out.println("Индекс массы тела:" + bmi);
    }
}