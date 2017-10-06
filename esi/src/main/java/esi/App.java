package esi;

public class App {
	public String sample() {
		return "Sample 2";
	}
	
	public String sampleMike() {
		return "Mike Sample";
	}
	
	public String sampleMiguel() {
		return "OutSystems dude - Is that a game?";
	}

	public static void main(String[] args) {
		System.out.println(new App().sample());
		System.out.println(new App().sampleMike());
		System.out.println(new App().sampleMiguel());
	}
}
