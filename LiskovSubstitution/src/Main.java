import java.util.ArrayList;
import java.util.List;

public class Main {

	List<IHedefiVur> hedefvurucular = new ArrayList<IHedefiVur>();
	List<IHedefTara> hedeftarayicilar =new ArrayList<IHedefTara>();
	List<ITaþýmaYap> tasiyicilar =new ArrayList<ITaþýmaYap>();
	

	public Main(List<IHedefiVur> hedefvurucular,List<IHedefTara> hedeftarayicilar,List<ITaþýmaYap> tasiyicilar) {
		
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
    
	public void taþýmaYap() {
		for (ITaþýmaYap tasi: tasiyicilar ) {
            tasi.taþýmaYap();
        }
	
}
}
