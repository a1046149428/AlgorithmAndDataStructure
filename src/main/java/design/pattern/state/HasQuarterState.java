package design.pattern.state;/*
 * @authorBryce
 *
 *
 * @date 2019/2/14 23:21
 */

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;

    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumBallMachine.getCount() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState()     );
        }
        gumBallMachine.setState(gumBallMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
