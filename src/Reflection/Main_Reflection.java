package Reflection;

import java.lang.reflect.Field;

public class Main_Reflection{


   public static void main(String[] args) {


    System.out.println("Welcome to Java Reflection");

   Car mycar =new Car(1, "BMW");


   Field[] myFields =mycar.getClass().getFields();


    for(Field field: myFields)
    {
        System.out.println(field.getName());
    }
    
        
    }
        
    
}