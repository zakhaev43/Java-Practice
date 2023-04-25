package Generics;

public class Cat implements Animal{

   int age;

    public Cat(int age)
    {
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println("I eat fish");
    }
    
}
