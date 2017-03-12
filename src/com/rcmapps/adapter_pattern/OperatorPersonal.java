package com.rcmapps.adapter_pattern;

/**
 * Created by tahmid on 3/12/17.
 */
public class OperatorPersonal implements ScannerFunctions {

    private ScannerFunctions printerFunctions;

    public OperatorPersonal(ScannerFunctions printerFunctions) {
        this.printerFunctions = printerFunctions;
    }

    @Override
    public void takePaper() {
        printerFunctions.takePaper();
    }

    @Override
    public void reset() {
        printerFunctions.reset();
    }

    @Override
    public void print() {
        printerFunctions.print();
    }

    @Override
    public void scan() {
        printerFunctions.scan();
    }
}
