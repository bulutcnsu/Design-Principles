import java.util.ArrayList;
import java.util.List;

public class Main {

	List<IHedefiVur> hedefvurucular = new ArrayList<IHedefiVur>();
	List<IHedefTara> hedeftarayicilar =new ArrayList<IHedefTara>();
	List<ITaşımaYap> tasiyicilar =new ArrayList<ITaşımaYap>();
	

	public Main(List<IHedefiVur> hedefvurucular,List<IHedefTara> hedeftarayicilar,List<ITaşımaYap> tasiyicilar) {
		
		this.hedeftarayicilar=hedeftarayicilar;
		this.hedefvurucular= hedefvurucular;
		this.tasiyicilar =tasiyicilar;
	}
	
	public void hedefiVur() {
		for (IHedefiVur vur: hedefvurucular) {
            vur.hedefeAtesEt(); ;
        }
	}
    
	public void hedefiTara() {
		for (IHedefTara tara: hedeftarayicilar) {
            tara.dusmanGemisiTara();
        }}
    
	public void taşımaYap() {
		for (ITaşımaYap tasi: tasiyicilar ) {
            tasi.taşımaYap();
        }
	
}
}
