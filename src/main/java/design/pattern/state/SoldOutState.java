package design.pattern.state;/*
 * @authorBryce
 *
 *
 * @date 2019/2/14 23:18
 */

public class SoldOutState implements State {
    GumBallMachine gumBallMachine;
    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine=gumBallMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("There is no gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't get quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("there is no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("there is no gumball");
    }
}
