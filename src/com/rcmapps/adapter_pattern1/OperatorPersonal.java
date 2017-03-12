package com.rcmapps.adapter_pattern1;

/**
 * Created by tahmid on 3/12/17.
 */
public class OperatorPersonal implements ScannerFunctions {

    private ScannerFunctions scannerFunctions;

    public OperatorPersonal(ScannerFunctions printerFunctions) {
        this.scannerFunctions = printerFunctions;
    }

    @Override
    public void takePaper() {
        scannerFunctions.takePaper();
    }

    @Override
    public void reset() {
        scannerFunctions.reset();
    }

    @Override
    public void print() {
        scannerFunctions.print();
    }

    @Override
    public void scan() {
        scannerFunctions.scan();
    }
}
