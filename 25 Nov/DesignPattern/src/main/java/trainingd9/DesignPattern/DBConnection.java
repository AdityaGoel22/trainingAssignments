package trainingd9.DesignPattern;

public class DBConnection {
	
	private static DBConnection instance;
	
	private DBConnection() {
		System.out.println("Instance created");
	}
	
	public static DBConnection getInstance() {
		if(instance != null)
			return instance;
		else
			return instance = new DBConnection();
	}
	
}
