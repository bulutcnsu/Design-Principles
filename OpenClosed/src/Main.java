
public class Main {
	
	 public static void main(String [] args) {	
		
		 SiparisOnay onay=new SiparisOnay();
		
		 Musteri musteri1 = new Musteri(123, "Ali Kurt", new StandartUyelikTipi());
		 
		 System.out.println(musteri1.getAdSoyad() + " bu �r�n i�in " + onay.FiyatHesapla(98.99, musteri1) +" tl �deme yap�yor");
		 
		 
		 
		 Musteri musteri2 = new Musteri(145, "Ayse Durmaz", new PremiumUyelikTipi());
		
		 System.out.println(musteri2.getAdSoyad() + " bu �r�n i�in " + onay.FiyatHesapla(98.99, musteri2) +" tl �deme yap�yor");
		 
		 Musteri musteri3 = new Musteri(123, "Atiye Sevigen", new GoldUyelikTipi());
		 
		 System.out.println(musteri3.getAdSoyad() + " bu �r�n i�in " + onay.FiyatHesapla(98.99, musteri3) +" tl �deme yap�yor");
		 
		 
		 
		 
}
}