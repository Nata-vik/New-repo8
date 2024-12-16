public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double weight = 98;       // вес в килограммах
        double height = 1.87;     // рост в метрах
        int result = service.calculate(weight, height);
        System.out.println("Ваш индекc массы тела = " + result);

    }
}





