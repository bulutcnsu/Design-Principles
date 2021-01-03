
public class PremiumUyelikTipi extends UyelikTipi {

	@Override
	public double uyelikHesapla(double fiyat) {
	
		return fiyat -(fiyat*0.2);
	}

}
