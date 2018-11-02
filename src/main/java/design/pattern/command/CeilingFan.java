package design.pattern.command;

/**
 * @author cherbini
 * 2018/11/1 17:34
 */
public class CeilingFan
{
    public static final int HiGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;

    public int getSpeed()
    {
        return speed;
    }

    int speed;

    public CeilingFan(String location)
    {

        this.location = location;
        speed = OFF;
    }

    public void high()
    {
        System.out.println("high!!");
        speed = HiGH;
    }

    public void medium()
    {
        speed = MEDIUM;
    }

    public void low()
    {
        speed = LOW;
    }

    public void off()
    {
        System.out.println("off"
        );
        speed = OFF;
    }
}
