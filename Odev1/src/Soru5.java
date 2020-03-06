import java.util.Random;

public class Soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[100];
		int i , deger;
		for (i=0;i<100;i++) {
			Random rastgele = new Random();
			deger = rastgele.nextInt(100);
			a[i] = deger;
		}
		
		for (i=0;i<100;i++) {
			if (a[i] % 2 == 0)
				System.out.print("(Çift) a[" + i + "] = " + a[i] + "\n");
			else
				System.out.print("\t\t\t(Tek) a[" + i + "] = " + a[i] + "\n");
		}
			
	}

}
