// import Singleton.PrinterManager;

public class Client {
    public static void main(String[] args) {
        PrinterManager printerManager = PrinterManager.getInstance();
        printerManager.assignJob("print something");
        printerManager.assignJob("print something again");
        printerManager.showStatus();
        PrinterManager printerManager2 = PrinterManager.getInstance();
        printerManager2.showStatus();
    }
}
