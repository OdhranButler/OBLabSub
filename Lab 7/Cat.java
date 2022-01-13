public class Cat extends Animal {
    
    public Cat()
    {
        setType("cat");
    }

    @Override
    public String makeSound()
    {
       return "MEOW";
    }
     
}