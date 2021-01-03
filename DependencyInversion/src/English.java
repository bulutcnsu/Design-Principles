
public class English implements IInputLanguage, IOutputLanguage{

	@Override
	public void write() {
			System.out.println("Translate to English");
	}

	@Override
	public void read(String text) {
		System.out.println("The text read as English");
		
	}

}
