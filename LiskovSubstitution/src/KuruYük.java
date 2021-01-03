
public class KuruYük extends Gemi implements ITaþýmaYap{

	@Override
	public void sudaHareketEt() {
		System.out.println("Kuruyük gemisi  Hareket Ediyor");
		
	}

	@Override
	public void yakýtAl() {
		System.out.println("Kuruyük gemisi yakýt alýyor");
		
	}

	@Override
	public void taþýmaYap() {
		System.out.println("KuruYük gemisi  ticari yük taþýyor");
	}

}
