
public class Main {

	public static void main(String[] args) {

		 
		Akademisyen a = new Akademisyen ("Ahmet", "a@gmail.com", "05353535", "CENG", "Hoca", "CENG 101");
		System.out.println(a.getAdSoyad());
		OgretimUyesi o = new OgretimUyesi("Mehmet", "m@gmail.com", "0535503535", "CENG", "Hoca", "CENG 102","Doçent");
		o.giris();
		
		
	}

}
