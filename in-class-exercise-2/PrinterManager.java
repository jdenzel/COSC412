// import Printer;

public class PrinterManager {

    private static PrinterManager the_Instance = new PrinterManager(8);
    Printer[] printers;

    private PrinterManager(int numPrinter) {
        printers = new Printer[numPrinter];
        for (int i = 0; i < numPrinter; i++) {
            printers[i] = new Printer();
        }
    }

    public static PrinterManager getInstance() {
        if (the_Instance == null) {
            the_Instance = new PrinterManager(8);
        }
        return the_Instance;
    }

    public String assignJob(String printJob) {
        for (Printer printer : printers) {
            if (printer.isBusy() == false) {
                printer.setBusy(true);
                printer.setPrintJob(printJob);
                return "job is assigned";
            }
        }
        return "all printers are busy, please try again later.";
    }

    public void showStatus() {
        for (int i = 0; i < printers.length; i++) {
            System.out.println("Status of Printer " + i + ":");
            if (printers[i].isBusy) {
                System.out.println("Busy");
            } else {
                System.out.println("Available");
            }
        }
    }
}