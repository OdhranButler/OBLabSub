public class Animal {
    private String type;
    private int age;
    private String gender;

    public Animal() {

    }

    public String getType() {
        return this.type;
    }

    public void setType(String typeIn) {
        this.type = typeIn;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int ageIn) {
        this.age = ageIn;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String genderIn) {
        this.gender = genderIn;
    }

    public void eat() {
        System.out.println("this animal is eating");
    }

    public void sleep() {
        System.out.println("this animal is sleeping");
    }

    public String makeSound() {
        return "generic animal sound";
    }

    public String toString() {
        return ("type is :" + this.type + 
        "\nage is : " + this.age + 
        "\ngender is : " + this.gender);

    }

    

}
