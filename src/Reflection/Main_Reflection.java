package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main_Reflection{


   public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {


    System.out.println("Welcome to Java Reflection");

    Car mycar =new Car(1, "BMW");


    //Acces all the fields of class Car
   Field[] myFields =mycar.getClass().getDeclaredFields();
    for(Field field: myFields)
    {
        System.out.println(field.getName());
    }


//Acces all the methods of class Car
    Method[] myMethods =mycar.getClass().getDeclaredMethods();
    for(Method method: myMethods)
    {
        System.out.println(method.getName());
    }


     //Invoke one method
    for(Method method: myMethods)
    {
        if(method.getName().equals("horn"))
        {
            method.invoke(mycar);
        
        }
    }

 //Invoke private method
 for(Method method: myMethods)
 {
     if(method.getName().equals("privateHorn"))
     {
        method.setAccessible(true);
         method.invoke(mycar);
       
        
     }

     if(method.getName().equals("staticHorn"))
     {
        
         method.invoke(null);
       
        
     }
 }


  
    }
        
    
}