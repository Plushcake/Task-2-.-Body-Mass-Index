public class BmiService {
    public float calculate(float m, float h) {
        //int m = 60; //Масса
        //int h = 160;//Рост
        float i = m / (h / 100 * 2);
        return i;
    }
}
