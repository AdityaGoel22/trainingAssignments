package trainingd9.DesignPattern;

public class WinFactory implements GUIFactory {

	@Override
	public Click click() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WinCheckbox();
	}

}
