public class InscribedCircle {
    public static void main(String[] args) {
        // Длина стороны квадрата
        double a = 10.0; //
        // r окружн, вписанной в квадрат
        double r = a / 2;
        // S квадрата
        double squareArea = a * a;
        // S окружности
        double circleArea = Math.PI * r * r;
        // Заштрихованная S: S квадрата - S окружности
        double shadedArea = squareArea - circleArea;
        System.out.println("Заштрихованная S " + shadedArea);
    }
}