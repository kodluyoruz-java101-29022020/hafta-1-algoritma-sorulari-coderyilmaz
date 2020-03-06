import java.util.Random;

public class Soru3 {
	
	
	public static void main (String args[]) {
		
		double cevap = ortalamaHesapla(randomArrayOlustur(100));
		
		System.out.println("Ortalama : " + cevap);
	}
	
	static int[] randomArrayOlustur (int n) {
		Random rand = new Random();
		int a[] = new int[n];
		for (int i=0;i<n;i++)
			a[i]=rand.nextInt(n);
		return a;
	}
	
	static double ortalamaHesapla (int[] arr) {
		double sum = 0;
		for (int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum/arr.length;
	}
	
	
}
