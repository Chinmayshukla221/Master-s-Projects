

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( Coins.quarter );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( Coins.quarter );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( Coins.quarter );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}
