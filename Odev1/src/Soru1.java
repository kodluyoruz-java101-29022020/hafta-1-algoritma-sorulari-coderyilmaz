import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String password="12345";
			Scanner input = new Scanner(System.in);
			System.out.println("Lütfen Þifre Giriniz : ");
			String userPassword = input.nextLine();
			System.out.println("Girdiðiniz Þifre : "+userPassword);
			if (!userPassword.equals(password))
				System.out.println("Giriþ Baþarýsýz");
			else
				System.out.println("Giriþ Baþarýlý");
			
			
	}

}
