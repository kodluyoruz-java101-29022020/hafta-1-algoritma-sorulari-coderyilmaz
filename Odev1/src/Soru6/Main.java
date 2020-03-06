package Soru6;

public class Main {

	public static void main(String[] args) {
		PDFDocument pdf = new PDFDocument("KodluyoruzOdeviPdf");
		WordDocument word = new WordDocument("KodluyoruzOdeviWord");
		
		Printer.printPDFDocument(pdf);
		Printer.printWordDocument(word);
	}

}
