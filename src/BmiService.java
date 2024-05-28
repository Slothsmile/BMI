public class BmiService {
    public int calculate(int weightKG, int heightCM) {
        int result = (weightKG / (heightCM/100) * (heightCM/100));
        return result;
    }
}
