import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String password="12345";
			Scanner input = new Scanner(System.in);
			System.out.println("L�tfen �ifre Giriniz : ");
			String userPassword = input.nextLine();
			System.out.println("Girdi�iniz �ifre : "+userPassword);
			if (!userPassword.equals(password))
				System.out.println("Giri� Ba�ar�s�z");
			else
				System.out.println("Giri� Ba�ar�l�");
			
			
	}

}
