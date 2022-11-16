
public class Calisan {

	String adSoyad, eposta, telefon;
	
	
	protected void giris() {
		System.out.println(this.adSoyad +"Çalışan giriş yaptı !");
	}


	public Calisan(String adSoyad, String eposta, String telefon) {
		this.adSoyad = adSoyad;
		this.eposta = eposta;
		this.telefon = telefon;
	}


	public String getAdSoyad() {
		return adSoyad;
	}


	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}


	public String getEposta() {
		return eposta;
	}


	public void setEposta(String eposta) {
		this.eposta = eposta;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	
	
}
