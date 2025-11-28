package trainingd9.DesignPattern;

public class MacFactory implements GUIFactory {

	@Override
	public Click click() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckbox();
	}

}
