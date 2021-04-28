package homework;

public class Kurs {
	public Kurs() {
		System.out.println("Ýlk constructor");
	}
	
	public Kurs(int kursId, String kName, String egitmen, int izlenme) {
		this.kursId=kursId;
		this.kName=kName;
		this.egitmen=egitmen;
		this.izlenme=izlenme;
	}
	
	int kursId;
	String kName;
	String egitmen;
	int izlenme;
}
