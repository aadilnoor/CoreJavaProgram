package com.opps;
interface Printer {
	void print(String message);
}
class ConsolePrinter implements Printer {
	public void print(String message) {
		System.out.println("Printing to console: " + message);
	}
}
class ReportGenerator {
	Printer printer;
	public ReportGenerator(Printer printer) {
		this.printer = printer;
	}
   public void generateReport() {
		String report = "This is the report content";
     printer.print(report);
	}
}
public class Losecoupling {
	public static void main(String[] args) {
		Printer consolePrinter = new ConsolePrinter();
		ReportGenerator ob = new ReportGenerator(consolePrinter);
		ob.generateReport();
		
	}
}
