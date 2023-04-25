package Generics;

public class BoundedGeneric <T extends Animal>{



    T thingToprint;

    public BoundedGeneric(T thingToprint)
    {
         this.thingToprint=thingToprint;
    }

    public T print()
    {
        thingToprint.eat();
        System.out.println(thingToprint);

        return thingToprint;
    }

    
    
}
