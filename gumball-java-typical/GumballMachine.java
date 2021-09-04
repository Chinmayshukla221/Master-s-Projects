enum Coins{
    nickel(5), dime(10), quarter(25)
    private int value;
    int getValue() {return value;}
    private Coins(int value)
    {
        this.value=value;
    }
}
public class GumballMachine
{
    private int cost_of_gumball;
    private boolean quarter_based;
    private int num_gumballs;
    private boolean has_quarter;
    private int total_coin_inserted;

    public GumballMachine( int size, int GumballCost, boolean CoinType )
    {
        // initialise instance variables
        this.quarter_based = CoinType;
        this.cost_of_gumball = GumballCost;
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertCoin(Coins coin)
    {
        if(quarter_based==true)
        {
            if(coin==Coins.quarter)
                this.total_coin_inserted+=Coins.quarter.getValue();
            else
                System.out.println("Sry not a valid coin");
        }
        else {
            switch (coin) {
                case quarter:
                    this.total_coin_inserted+=Coins.quarter.getValue();
                case dime:
                    this.total_coin_inserted+=Coins.dime.getValue();
                case nickel:
                    this.total_coin_inserted+=Coins.nickel.getValue();
                default:
                    System.out.println("Sry not a valid coin");
            }
        }
    }
    
    public void turnCrank()
    {
    	if ( total_coin_inserted==cost_of_gumball )
    	{
            total_coin_inserted =0;
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a coin" ) ;
    	}        
    }
}
