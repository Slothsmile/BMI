public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        int heightCM = 187;
        int bmi = service.calculate(weightKg, heightCM);
        System.out.println(bmi);
    }
}