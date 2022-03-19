public class Main {
    public static void main(String[] args) {
        //int m = 60; // Вес
        //int h = 160;// Рост
        //float i = m / (h / 100*2);
        BmiService service = new BmiService();
        float bmiService1 = service.calculate(60, 160);
        System.out.println(bmiService1);
        float bmiService2 = service.calculate(100, 190);
        System.out.println(bmiService2);

        // System.out.println("Ваш индекс массы тела " + i);
    }
}
