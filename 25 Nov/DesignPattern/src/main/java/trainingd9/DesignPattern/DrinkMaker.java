package trainingd9.DesignPattern;

public abstract class DrinkMaker {
	
	public final void prepareDrink() {
		
		boilWater();
		makeDrink();
		addExtras();
		serve();
		
	}
	
	public void boilWater() {
		
		System.out.println("Water Boiled");
	}
	
	public void serve() {
		System.out.println("Drink Served");
	}
	
	abstract void makeDrink();
	abstract void addExtras();
	
}
