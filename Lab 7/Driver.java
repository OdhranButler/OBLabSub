
public class Driver {
    public static void main(String[] args) throws Exception {
        
        Vet vet1 = new Vet();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        vet1.vaccinate(dog1);

        vet1.vaccinate(cat1);

    }
}