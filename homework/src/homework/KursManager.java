package homework;

public class KursManager {
	//Siteye kurs eklendiðinde
	public void addToCourse(Kurs kurs) {
		System.out.println("Siteye yeni kurs eklendi: " + kurs.kName);
	}
	
	//Siteden kurs silindiðinde
	public void deleteToCourse(Kurs kurs) {
		System.out.println("Siteden kurs silindi: " + kurs.kName);
	}
	
	//Siteye yeni eðitmen eklendiðinde
	public void addToTeacher(Kurs kurs) {
		System.out.println("Yeni Eðitmenimizle Tanýþ: " + kurs.egitmen);
	}
	
	//Siteden kullanýcý silindiðinde
	public void deleteToProfil(Profil profil) {
		System.out.println("Kullanýcý Silindi: " + profil.name);
	}
}
