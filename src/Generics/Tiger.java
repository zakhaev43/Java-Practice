package Generics;

public class Tiger implements Animal {

    int age;

    public Tiger(int age)
    {
        this.age=age;
    }
    @Override
    public void eat() {
        System.out.println("I eat rad meat");
    }
    
}
