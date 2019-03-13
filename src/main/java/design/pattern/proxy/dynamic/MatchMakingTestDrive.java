package design.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author Bryce
 * @date 2019/3/13 22:47
 */
public class MatchMakingTestDrive {
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        PersonBean personBean = new PersonBeanImpl();
        personBean.setGender("man");
        personBean.setName("bryce");
        personBean.setInterests("music");

        PersonBean non = testDrive.getNonOwnerProxy(personBean);
        non.setHotOrNotRating(111);

        PersonBean own = testDrive.getOwnerProxy(personBean);

        System.out.println(own.getHotOrNotRating());

        non.setInterests("2132");

        own.setHotOrNotRating(1231231231);

    }

}

