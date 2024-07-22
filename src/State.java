//6510451131 Ithikorn Ungniyom

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void chooseFlavor(String flavor);
}
