public class BmiService {
    public int calculate(double height, int weight) {

        height = (height * height);

        int bmi = (int) ((int) weight / height);

        return bmi;

    }
}
