
public class Main {

	public static void main(String[] args) {
		
		TranslateManager manager = new TranslateManager(new English(), new Dutch());
		manager.translate("hello");
		

	}

}
