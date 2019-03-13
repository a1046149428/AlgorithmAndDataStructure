package design.pattern.state;/*
 * @authorBryce
 *
 *
 * @date 2019/2/16 8:43
 */

public class WinnerState implements State {
    private GumBallMachine gumBallMachine;
    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine=gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("error");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("error");

    }

    @Override
    public void turnCrank() {
        System.out.println("error");

    }

    @Override
    public void dispense() {
        System.out.println("you win,get the two gumballs for your quarter");
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount()==0){
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }else {
            gumBallMachine.releaseBall();
            if (gumBallMachine.getCount()>0){
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            }else {
                System.out.println("Oops,out of gumballs");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }
}
