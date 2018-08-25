public class Overload 
{
    
    void area()
    {
        System.out.println("NULL");
    }
    void area(int x)
    {
        System.out.println("Integer: "+x);
    }
    void area(float x)
    {
        System.out.println("Float: "+x);
    }
    public static void main(String[] args)
    {
        float b=0.5f;
        Overload p=new Overload();
        p.area();
        p.area(5);
        p.area(b);
    }
}