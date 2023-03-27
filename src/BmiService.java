public class BmiService {
    public int calculate(double height) {
        int weight = 150;
        height = (height * height);

        int bmi = (int) ((int) weight / height);

        return bmi;

    }
}
