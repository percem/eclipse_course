package homework;

public class KursManager {
	//Siteye kurs eklendiğinde
	public void addToCourse(Kurs kurs) {
		System.out.println("Siteye yeni kurs eklendi: " + kurs.kName);
	}
	
	//Siteden kurs silindiğinde
	public void deleteToCourse(Kurs kurs) {
		System.out.println("Siteden kurs silindi: " + kurs.kName);
	}
	
	//Siteye yeni eğitmen eklendiğinde
	public void addToTeacher(Kurs kurs) {
		System.out.println("Yeni Eğitmenimizle Tanış: " + kurs.egitmen);
	}
	
	//Siteden kullanıcı silindiğinde
	public void deleteToProfil(Profil profil) {
		System.out.println("Kullanıcı Silindi: " + profil.name);
	}
}
