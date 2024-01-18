public class BmiService {
    public int calculate(double weight, double height) {
        double height2 = height * height;
        double index = weight / height2;
        return (int) index;

    }
}
