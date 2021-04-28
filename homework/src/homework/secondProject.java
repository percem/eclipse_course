package homework;

public class secondProject {

	public static void main(String[] args) {
		
		//Profil classýný tanýmlayalým
		//Ýlk constructor
		Profil kullanici=new Profil(1,"ümmühan","perçem","abcdef","erzincan");
		
		
		//2.constructor
		Profil kullanici2=new Profil();
		kullanici2.profId=2;
		kullanici2.name="asel";
		kullanici2.surname="perçem";
		kullanici2.password="12ef34";
		kullanici2.address="Ýstanbul";
		Profil[] prof= {kullanici,kullanici2};
		
		for (Profil profil : prof) {
			System.out.println(profil.name);
		}
		
		
		//Kurs classý için
		
		Kurs kurs1=new Kurs(1,"Java","Engin Demiroð",32);
		
		Kurs kurs2=new Kurs();
		kurs2.kursId=2;
		kurs2.kName="C#";
		kurs2.egitmen="Kerem Varýþ";
		kurs2.izlenme=83;
		Kurs[] kurslar= {kurs1,kurs2};
		
		for (Kurs kurs : kurslar) {
			System.out.println(kurs.kName);
		}
		
		//Ýþ sýnýflarýný çaðýralým
		KursManager kursManager=new KursManager();
		//Kurs1 eklendi
		kursManager.addToCourse(kurs1);
		//Eðitmen eklendi
		kursManager.addToTeacher(kurs2);
		//Kurs2 silindi
		kursManager.deleteToCourse(kurs2);
		//Kullanýcý silindi
		kursManager.deleteToProfil(kullanici);
	}

}
