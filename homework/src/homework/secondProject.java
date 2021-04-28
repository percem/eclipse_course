package homework;

public class secondProject {

	public static void main(String[] args) {
		
		//Profil class�n� tan�mlayal�m
		//�lk constructor
		Profil kullanici=new Profil(1,"�mm�han","per�em","abcdef","erzincan");
		
		
		//2.constructor
		Profil kullanici2=new Profil();
		kullanici2.profId=2;
		kullanici2.name="asel";
		kullanici2.surname="per�em";
		kullanici2.password="12ef34";
		kullanici2.address="�stanbul";
		Profil[] prof= {kullanici,kullanici2};
		
		for (Profil profil : prof) {
			System.out.println(profil.name);
		}
		
		
		//Kurs class� i�in
		
		Kurs kurs1=new Kurs(1,"Java","Engin Demiro�",32);
		
		Kurs kurs2=new Kurs();
		kurs2.kursId=2;
		kurs2.kName="C#";
		kurs2.egitmen="Kerem Var��";
		kurs2.izlenme=83;
		Kurs[] kurslar= {kurs1,kurs2};
		
		for (Kurs kurs : kurslar) {
			System.out.println(kurs.kName);
		}
		
		//�� s�n�flar�n� �a��ral�m
		KursManager kursManager=new KursManager();
		//Kurs1 eklendi
		kursManager.addToCourse(kurs1);
		//E�itmen eklendi
		kursManager.addToTeacher(kurs2);
		//Kurs2 silindi
		kursManager.deleteToCourse(kurs2);
		//Kullan�c� silindi
		kursManager.deleteToProfil(kullanici);
	}

}
