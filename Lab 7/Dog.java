public class Dog extends Animal {
    
    public Dog()
    {
        setType("dog");
    }



    @Override
    public String makeSound()
    {
       return "BOURK";
    }
     
}
