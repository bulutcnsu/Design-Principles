
public class DocumentSample3 implements IDocumentIncludingQuote,IDocumentIncludingGraphic{

	@Override
	public void create() {
	System.out.println("Document is created ");
		
	}

	@Override
	public void useGraphic() {
		System.out.println("Document used graphic ");
		
	}

	@Override
	public void useQuote() {
		System.out.println("Document used quote");
		
	}

}
