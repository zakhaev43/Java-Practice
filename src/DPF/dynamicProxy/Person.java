package DPF.dynamicProxy;

public class Person implements Human{
    @Override
    public void talk() {
        System.out.println("person is talking");
    }
    @Override
    public void walk() {
      
        System.out.println("person is walking");
        
    }
}
