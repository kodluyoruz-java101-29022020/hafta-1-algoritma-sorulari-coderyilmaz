package calisma;

public class Main {
	public static void main (String args[]) {
	car car1 = new car();
	
	car1.color = "Gümüþ";
	car1.model = "Opel";
	car1.engine = 1;
	car1.doors = 5;
	
	System.out.println("Arabanýn Rengi : " + car1.color + "Arabanýn Modeli : " + car1.model + "Arabanýn Motor Hacmi : " + car1.engine);
	}
}
