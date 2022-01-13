public class Vet {
    
    private String name;

    public Vet()
    {

    }
    
    public void setName(String nameIn)
    {
        this.name = nameIn;
    }

    public String getName()
    {
        return this.name;
    }

    public void vaccinate(Animal animalIn)
    {
        System.out.println(getName() + " is vaccinating");

        if(animalIn.getType() == "dog")
        {
            System.out.println("Dog has been vaccinated" + animalIn.toString());
        }
        else if(animalIn.getType() == "cat")
        {
            System.out.println("Cat has been vaccinated" + animalIn.toString());
        }
    }
    
}
