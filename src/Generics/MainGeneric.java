package Generics;

public class MainGeneric {

    public static void main(String[] args)
    {
       Printer<Integer> printer1 = new Printer<>(23);

       printer1.print();

       Cat cat = new Cat(5);




      BoundedGeneric<Cat> printer2 = new BoundedGeneric<>(cat);
      
       Animal a= printer2.print();

       System.out.println(a);
    }
    
}
