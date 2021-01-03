
public class DocumentSample2  implements IDocumentIncludingPicture,IDocumentIncludingQuote{

	@Override
	public void create() {
		System.out.println(" Doc is created");
		
	}

	@Override
	public void useQuote() {
		System.out.println(" Quotes are used");
		
	}

	@Override
	public void usePicture() {
		System.out.println(" picture is  used");
		
	}


}
