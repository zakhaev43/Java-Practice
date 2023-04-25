package Generics;

public class Printer<T> {

    T thingToprint;

    public Printer( T thingToprint)
    {
         this.thingToprint=thingToprint;
    }

    public void print()
    {
        System.out.println(thingToprint);
    }
    
}
