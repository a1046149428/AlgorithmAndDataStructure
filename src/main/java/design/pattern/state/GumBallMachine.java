package design.pattern.state;

/**
 * @author cherbini
 * 2018/11/7 20:48
 */
public class GumBallMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state=soldOutState;
    int count=0;


    public GumBallMachine(int numberGumballs){
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState=new HasQuarterState(this);
        soldState=new SoldState(this);
        this.count=numberGumballs;
        if (numberGumballs>0){
            state=noQuarterState;
        }


    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
   void setState(State state){
        this.state=state;
    }
   public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /* old code
     final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;


    int state = SOLD_OUT;
    int count = 0;

    public GumBallMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You insert a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter,the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait,we're already giving you a gumball");
        }
    }

    public void  ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state=NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        }else if (state==SOLD) {
            System.out.println("Sorry,you already turned the crank");
        }else if(state==SOLD_OUT){
            System.out.println("You can't eject,you haven't inserted a quarter yet");
        }
    }

    public void  turnCrank(){
        if (state==SOLD){
            System.out.println("Turning twice doesn't get you another gumball!");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned,but there are no gumballs");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state=SOLD;
            dispense();
        }

    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state=SOLD_OUT;
            }else {
                state=NO_QUARTER;
            }
        }else if (state==NO_QUARTER){
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        }else if (state==HAS_QUARTER){
            System.out.println("No gumball dispensed");
        }
    }*/



}
