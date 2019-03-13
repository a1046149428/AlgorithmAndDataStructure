package design.pattern.proxy.dynamic;

/**
 * @author Bryce
 * @date 2019/3/13 22:30
 */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();


    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}
