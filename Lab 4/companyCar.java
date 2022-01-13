public class companyCar {

    private String carMake;
    private String carModel;
    private int carYear;

    public companyCar() // constructor method #1
    {

    }

    public String getMake() {
        return this.carMake;
    }

    public void setMake(String makeIn) {
        this.carMake = makeIn;
    }

    public String getModel() {
        return this.carModel;
    }

    public void setModel(String modelIn) {
        this.carModel = modelIn;
    }

    public int getYear() {
        return this.carYear;
    }

    public void setYear(int yearIn) {
        this.carYear = yearIn;
    }

    public String toString()
    {
        return "the make of the car is: " + this.getMake() + 
        "\n the model of the car is: " + this.getModel() +
        "\n the year on the car is: " + this.getYear();
    }
}
