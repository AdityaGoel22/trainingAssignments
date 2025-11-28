package trainingd9.DesignPattern;

public class Logger {
	private static Logger instance;
	
	private Logger() {
		System.out.println("Instance created");
	}
	
	public static Logger getInstance() {
		if(instance != null)
			return instance;
		else
			return instance = new Logger();
	}
	
}
