package com.rcmapps.adapter_pattern;


/**
 * Created by tahmid on 3/12/17.
 */
public class Main {

    public static void main(String[] args){

        Printer printer = new PrinterDevice();
        ScannerFunctions scannerPrinterDevice = new ScannerPrinterDevice(printer);
        OperatorPersonal personal = new OperatorPersonal(scannerPrinterDevice);
        personal.print();
        personal.scan();

    }
}
