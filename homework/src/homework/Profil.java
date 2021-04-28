package homework;

public class Profil {
	public Profil(int profId, String name, String surname, String password, String address) {
	this.profId=profId;
	this.name=name;
	this.surname=surname;
	this.password=password;
	this.address=address;
	}
	
	public Profil() {
		System.out.println("2.constructor");
	}
	//Profil Özellikleri
	int profId;
	String name;
	String surname;
	String password;
	String address;
}
