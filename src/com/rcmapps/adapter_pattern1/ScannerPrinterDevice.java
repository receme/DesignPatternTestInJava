package com.rcmapps.adapter_pattern1;

/**
 * Created by tahmid on 3/12/17.
 */
public class ScannerPrinterDevice implements ScannerFunctions {

    PrinterDevice printerDevice;

    public ScannerPrinterDevice() {
        printerDevice = new PrinterDevice();
    }

    @Override
    public void takePaper() {
        printerDevice.takePaper();
    }

    @Override
    public void reset() {
        printerDevice.reset();
    }

    @Override
    public void print() {
        printerDevice.print();
    }

    @Override
    public void scan() {
        System.out.println("Scan with functionality added in scanner-printer device. because adapted \"printer\" device does not have scan functionality");
    }


}
