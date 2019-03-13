package design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Bryce
 * @date 2019/3/13 22:42
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(personBean,args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }

        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
