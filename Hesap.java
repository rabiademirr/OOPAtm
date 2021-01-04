
public class Hesap {
	private String kullaniciAdi;
	private String parola;
	private int bakiye;
	
	
	public Hesap(String kullaniciAdi, String parola, int bakiye) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	public void paraYatir(int tutar) {
		bakiye +=tutar;
		System.out.println("Güncel bakiyeniz:"+bakiye);
	}
	public void paraCek(int tutar) {
		if(tutar>1500) {
			System.out.println("Günlük çekebileceðiniz max tutar 1500 TL dir!!!");
		}
		else if(tutar>bakiye ) {
			System.out.println("Çekebileceðiniz miktari aþtiniz!!");
			
		}
		else {
			System.out.println("Güncel bakiyeni:"+bakiye);
			bakiye -=tutar;
		}
	}

}
