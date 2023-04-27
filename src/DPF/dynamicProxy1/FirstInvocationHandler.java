package DPF.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class FirstInvocationHandler implements InvocationHandler {
    private final Object target;

    public FirstInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("First proxy: Before method call");
        Object result = method.invoke(target, args);
        System.out.println("First proxy: After method call");
        return result;
    }
}