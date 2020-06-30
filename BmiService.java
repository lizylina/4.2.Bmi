public class BmiService {
    public float calculate (float weightKg, float heightSm) {
        float bmi = weightKg / (heightSm * heightSm / 10000);
        return bmi;
    }
}
