package com.rcmapps.adapter_pattern;

/**
 * Created by tahmid on 3/12/17.
 */
public class Main {

    public static void main(String[] args){

        Printer printer = new PrinterDevice();
        ScannerPrinterDevice scannerPrinterDevice = new ScannerPrinterDevice(printer);
        scannerPrinterDevice.print();
        scannerPrinterDevice.scan();

    }
}
