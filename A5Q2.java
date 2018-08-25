class Animals
{
    void breed()
    {
        System.out.println("I am an Animal.");
    }
    void color()
    {
        System.out.println("My color is brown.");
    }
    void speak()
    {
        
    }
}
class Dog extends Animals
{
    public void speak()
    {
        System.out.println("Woof-Woof!");
    }
}
class Cat extends Animals
{
    public void speak()
    {
        System.out.println("Meow!");
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.breed();
        d.color();
        d.speak();
        c.breed();
        c.color();
        c.speak();
    }
    
}
