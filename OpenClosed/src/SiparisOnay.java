
public class SiparisOnay {

	public double FiyatHesapla( double fiyat, Musteri musteri) {
	
		return	musteri.getUyelik().uyelikHesapla(fiyat);
		
	}
}
