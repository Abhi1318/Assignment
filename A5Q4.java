abstract class Vehicle
{
    abstract void start();
    void stop()
    {
        
    }
}
class TwoWheeler extends Vehicle
{
    public void start()
    {
        System.out.println("The TwoWheeler is on.");
    }
    void stop()
    {
        System.out.println("The TwoWheeler is off.");
    }
}
class FourWheeler extends Vehicle
{
    public void start()
    {
        System.out.println("The FourWheeler is on.");
    }
    void stop()
    {
        System.out.println("The FourWheeler is off.");
    }
}
public class AbstractMethods 
{
    public static void main(String[] args)
    {
        TwoWheeler t=new TwoWheeler();
        FourWheeler f=new FourWheeler();
        t.start();
        t.stop();
        f.start();
        f.stop();
    }
    
}
