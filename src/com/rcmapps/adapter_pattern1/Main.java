package com.rcmapps.adapter_pattern1;

/**
 * Created by tahmid on 3/12/17.
 */
public class Main {

    public static void main(String[] args){

        ScannerPrinterDevice scannerPrinterDevice = new ScannerPrinterDevice();

        OperatorPersonal personal = new OperatorPersonal(scannerPrinterDevice);
        personal.print();
        personal.scan();
    }
}
