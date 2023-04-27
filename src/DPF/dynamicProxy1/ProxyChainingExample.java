package DPF.dynamicProxy1;

import java.lang.reflect.Proxy;

public class ProxyChainingExample {
    public static void main(String[] args) {
        TargetObject targetObject = new TargetObject();
        FirstInvocationHandler firstHandler = new FirstInvocationHandler(targetObject);
        MyInterface firstProxy = (MyInterface) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                firstHandler
        );

        SecondInvocationHandler secondHandler = new SecondInvocationHandler(firstProxy);
        MyInterface secondProxy = (MyInterface) Proxy.newProxyInstance(
                firstProxy.getClass().getClassLoader(),
                firstProxy.getClass().getInterfaces(),
                secondHandler
        );

        secondProxy.doSomething();
    }
}