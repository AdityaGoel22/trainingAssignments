package trainingd9.DesignPattern;

public class ShapesFactory {
	
	public static Shape getShape(String type) {
		if (type.equals("circle"))
			return new Circle();
		if(type.equals("square"))
			return new square();
		return null;
	}
	
}
