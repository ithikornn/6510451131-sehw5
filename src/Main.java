//6510451131 Ithikorn Ungniyom

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.chooseFlavor("Mango");
        gumballMachine.chooseFlavor("Orange");
        gumballMachine.turnCrank();

    }

}
