import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int sayi1,sayi2,sonuc;
		System.out.println("1 - Toplama");
		System.out.println("2 - ��karma");
		System.out.println("3 - �arpma");
		System.out.println("4 - B�lme");
		System.out.println("1 ile 4 aras�nda bir i�lem tipi se�iniz : ");
		byte userChoice = input.nextByte();
		
		
		if (userChoice == 1) {
			System.out.print("1. Say�y� Giriniz : ");
			sayi1 = input.nextInt();
			System.out.print("2. Say�y� Giriniz : ");
			sayi2 = input.nextInt();
			sonuc = sayi1 + sayi2;
			System.out.print(sayi1 + " + " + sayi2 + " = " + sonuc);
		}
		else if (userChoice == 2) {
			System.out.print("1. Say�y� Giriniz : ");
			sayi1 = input.nextInt();
			System.out.print("2. Say�y� Giriniz : ");
			sayi2 = input.nextInt();
			sonuc = sayi1 - sayi2;
			System.out.print(sayi1 + " - " + sayi2 + " = " + sonuc);
		}
		else if (userChoice == 3) {
			System.out.print("1. Say�y� Giriniz : ");
			sayi1 = input.nextInt();
			System.out.print("2. Say�y� Giriniz : ");
			sayi2 = input.nextInt();
			sonuc = sayi1 * sayi2;
			System.out.print(sayi1 + " * " + sayi2 + " = " + sonuc);
		}
		else if (userChoice == 4) {
			System.out.print("1. Say�y� Giriniz : ");
			sayi1 = input.nextInt();
			System.out.print("2. Say�y� Giriniz : ");
			sayi2 = input.nextInt();
			sonuc = sayi1 / sayi2;
			System.out.print(sayi1 + " / " + sayi2 + " = " + sonuc);
		}
	}

}
