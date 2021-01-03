
public class TranslateManager {
	
	IInputLanguage input;
	IOutputLanguage output;
	
	public TranslateManager( IInputLanguage input, IOutputLanguage output) {
		this.input=input;
		this.output =output;	
	}
		
	  public void translate(String inputText)
	     {
	   		  input.read(inputText);
	   		  output.write();
	   		  
	     }
}
