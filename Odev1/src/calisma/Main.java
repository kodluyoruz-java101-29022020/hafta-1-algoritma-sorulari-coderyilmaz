package calisma;

public class Main {
	public static void main (String args[]) {
	car car1 = new car();
	
	car1.color = "G�m��";
	car1.model = "Opel";
	car1.engine = 1;
	car1.doors = 5;
	
	System.out.println("Araban�n Rengi : " + car1.color + "Araban�n Modeli : " + car1.model + "Araban�n Motor Hacmi : " + car1.engine);
	}
}
