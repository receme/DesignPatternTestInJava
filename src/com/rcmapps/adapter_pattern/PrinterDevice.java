package com.rcmapps.adapter_pattern;

/**
 * Created by tahmid on 3/12/17.
 */
public class PrinterDevice implements Printer{

    @Override
    public void takePaper() {
        System.out.println("take paper by printer device functionality");
    }

    @Override
    public void reset() {
        System.out.println("reset by printer device functionality");
    }

    @Override
    public void print() {
        System.out.println("print by printer device functionality");
    }
}
