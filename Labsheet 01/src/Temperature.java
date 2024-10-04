public class Temperature {
    private float celsius;
    private float fahrenheit;

    public Temperature(float celsius) {
        this.celsius = celsius;
    }


    public float convert(){
        fahrenheit = this.celsius * ((float) 9 /5) +32;
        return fahrenheit;
    }

}
