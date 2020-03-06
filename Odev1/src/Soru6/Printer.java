package Soru6;

class Printer {
	static void printPDFDocument(PDFDocument pdf) {
		System.out.println(pdf.getBody());
	}
	
	static void printWordDocument(WordDocument pdf) {
		System.out.println(pdf.getBody());
	}
}

/* 
 E�er biz property veya metodu static yaparsak, ram de ona kal�c� haf�za vermi� oluruz.
 B�ylece o s�n�ftan t�reyen b�t�n nesnelerde, static yap�lm�� property veya metot i�in, ram de
 ayr� bir haf�za a��lmaz, hepsi o s�n�f�n o property veya metoduna ait mevcut ram haf�zas�n� kullan�r.
 */
