
public class Dutch implements IInputLanguage, IOutputLanguage {

	@Override
	public void write() {
		System.out.println("Translate to Dutch");
	}

	@Override
	public void read(String text) {
		System.out.println("The text read as Dutch");
		
	}

}
