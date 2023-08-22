public class Airplane {
	private String id;
	private double price;
	private int yearOfPurchased;
	private int numOfPassenger;
	private int numOfAirplane = 0;

	public Airplane(){
            this("", 0.0, 0, 0);
	}
	
	public Airplane(String id, double price, int yearOfPurchased, 
	int numOfPassenger){
		this.id = id;
		this.price = price;
		this.yearOfPurchased = yearOfPurchased;
		this.numOfPassenger = numOfPassenger;
		numOfAirplane++;
	}

	public void setId(String id){
		this.id = id;
	}
	
	public void setNumOfPassenger(int numOfPassenger){
		this.numOfPassenger = numOfPassenger;
	}
	
	public String getId(String id){
		return this.id;
	}

	public double getPrice(double price){
		return this.price;
	}

	public int getYearOfPurchased(int yearOfPurchased){
		return this.yearOfPurchased;
	}
	
	public int getNumOfPassenger(int numOfPassenger){
		return this.numOfPassenger;
	}

	
	public int getNumOfAirplane(int numOfAirplane){
		return this.numOfAirplane;
	}

	public double calCurrentValue(){
		double currentValue = price - (price * 0.1 * (2011 - yearOfPurchased));	
		return (currentValue < 0)? 0 : currentValue;
	}

        @Override
	public String toString(){
            return "ID:" + id + 
                    ", Price: " + price + 
                    ", Year Of Purchased: " + yearOfPurchased + 
                    ", Number of Passenger: " + numOfPassenger +
                    ", Number of Airplane: " + numOfAirplane;
	}
}