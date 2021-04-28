package homework;

public class KursManager {
	//Siteye kurs eklendi�inde
	public void addToCourse(Kurs kurs) {
		System.out.println("Siteye yeni kurs eklendi: " + kurs.kName);
	}
	
	//Siteden kurs silindi�inde
	public void deleteToCourse(Kurs kurs) {
		System.out.println("Siteden kurs silindi: " + kurs.kName);
	}
	
	//Siteye yeni e�itmen eklendi�inde
	public void addToTeacher(Kurs kurs) {
		System.out.println("Yeni E�itmenimizle Tan��: " + kurs.egitmen);
	}
	
	//Siteden kullan�c� silindi�inde
	public void deleteToProfil(Profil profil) {
		System.out.println("Kullan�c� Silindi: " + profil.name);
	}
}
