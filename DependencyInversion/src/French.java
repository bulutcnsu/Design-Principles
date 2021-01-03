
public class French implements IInputLanguage, IOutputLanguage{

	@Override
	public void write() {
		System.out.println("Translate to French");
		
	}

	@Override
	public void read(String text) {
		System.out.println("The text read as French");
		
	}

}
