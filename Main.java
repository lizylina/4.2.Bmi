public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate (75, 180);
        System.out.printf("Индекс массы тела = %.2f", bmi);
    }
}
