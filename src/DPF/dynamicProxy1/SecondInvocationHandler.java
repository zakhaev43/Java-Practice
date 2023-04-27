package DPF.dynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class SecondInvocationHandler implements InvocationHandler {
    private final Object target;

    public SecondInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Second proxy: Before method call");
        Object result = method.invoke(target, args);
        System.out.println("Second proxy: After method call");
        return result;
    }
}