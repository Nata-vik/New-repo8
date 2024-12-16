public class BmiService {
    public int calculate(double weight, double height) {

        double bmi = weight / Math.pow(height, 2);  // вес поделить на рост в квадрате
        bmi = (int) bmi;
        return (int) bmi;
    }
}







