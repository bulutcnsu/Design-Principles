
public class Musteri {
	private int musteriId;
	private String adsoyad;
	private String soyad;
	private UyelikTipi uyelik;
	
	public Musteri(int id,String adsoyad,UyelikTipi uyelik) {
		this.musteriId = id;
		this.adsoyad = adsoyad;
		this.uyelik = uyelik;
		
	}
	
	public int getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	public String getAdSoyad() {
		return adsoyad;
	}
	public void setAdSoyad(String ad) {
		this.adsoyad = ad;
	}
	
	
	public UyelikTipi getUyelik() {
		return uyelik;
	}
	public void setUyelik(UyelikTipi uyelik) {
		this.uyelik = uyelik;
	}
	
	

}
