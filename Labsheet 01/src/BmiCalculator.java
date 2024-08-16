public class BmiCalculator {

    private float weight;
    private float height;
    private float bmi;

    public BmiCalculator(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    //calculate BMI
    public float calculate(){
        bmi = weight/(height * height);

        return bmi;
    }

}
