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
 Eðer biz property veya metodu static yaparsak, ram de ona kalýcý hafýza vermiþ oluruz.
 Böylece o sýnýftan türeyen bütün nesnelerde, static yapýlmýþ property veya metot için, ram de
 ayrý bir hafýza açýlmaz, hepsi o sýnýfýn o property veya metoduna ait mevcut ram hafýzasýný kullanýr.
 */
